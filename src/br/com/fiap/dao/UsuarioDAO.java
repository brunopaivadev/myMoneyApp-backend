package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.mymoney.Usuario;

// conexao com banco
public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	// declarcoes

	// insere usuario no db
	public void insert(Usuario usuario) throws SQLException {
		// variavel da query sql
		String sql = "insert into usuario(idUsuario, cpf, nome, email, celular, login, senha) values (?,?,?,?,?,?,?)";
		// prepara a declaracao para a conexao
		PreparedStatement stmt = conexao.prepareStatement(sql);
		// populando as declaracoes dos objetos
		stmt.setInt(1, usuario.getIdUsuario());
		stmt.setString(2, usuario.getCpf());
		stmt.setString(3, usuario.getNome());
		stmt.setString(4, usuario.getEmail());
		stmt.setInt(5, usuario.getCelular());
		stmt.setString(6, usuario.getLogin());
		stmt.setString(7, usuario.getSenha());

		stmt.execute();
		stmt.close();
	}

	// busca os usuarios no db
	public List<Usuario> select() throws SQLException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "select * from usuario order by idUsuario";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Usuario usuario = new Usuario();
			usuario.setIdUsuario(rs.getInt("idUsuario"));
			usuario.setCpf(rs.getString("cpf"));
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setCelular(rs.getInt("celular"));
			usuario.setLogin(rs.getString("login"));
			usuario.setSenha(rs.getString("senha"));

			usuarios.add(usuario);
		}

		rs.close();
		stmt.close();
		return usuarios;

	}

	// busca um unico usuario pelo id
	public Usuario selectById(int idUsuario) throws SQLException {
		Usuario usuario = null;
		String sql = "select * from usuario where idUsuario=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			usuario = new Usuario();
			usuario.setIdUsuario(rs.getInt("idUsuario"));
			usuario.setCpf(rs.getString("cpf"));
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setCelular(rs.getInt("celular"));
			usuario.setLogin(rs.getString("login"));
			usuario.setSenha(rs.getString("senha"));
		}

		rs.close();
		stmt.close();
		return usuario;

	}

	// deleta usuario pelo id
	public void delete(int idUsuario) throws SQLException {
		String sql = "delete from usuario where idUsuario=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, idUsuario);
		stmt.execute();
		stmt.close();
	}

	// faz atualizacao dos dados de um usuario
	public void update(Usuario usuario) throws SQLException {
		String sql = "update usuario set nome=?, email=?, celular=?, senha=?, where idUsuario=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setInt(3, usuario.getCelular());
		stmt.setString(4, usuario.getSenha());
		stmt.setLong(5, usuario.getIdUsuario());

		stmt.execute();
		stmt.close();

	}

}
