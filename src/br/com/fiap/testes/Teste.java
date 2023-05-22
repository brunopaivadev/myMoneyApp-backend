package br.com.fiap.testes;

import java.sql.SQLException;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.mymoney.Usuario;

public class Teste {

	public static void main(String[] args) throws SQLException {

		UsuarioDAO dao = new UsuarioDAO();

		Usuario Bruno = new Usuario();
		Usuario Paola = new Usuario();
		Usuario Sonia = new Usuario();
		Usuario Rozana = new Usuario();
		Usuario Malu = new Usuario();

		
		// Usuario 1
		Bruno.setIdUsuario(1);
		Bruno.setNome("Bruno Paiva de Araujo");
		Bruno.setCpf("40837223806");
		Bruno.setEmail("bruno@email.com.br");
		Bruno.setCelular(986678216);
		Bruno.setLogin("brunopaiva");
		Bruno.setSenha("123b");

		// Usuario 2
		Paola.setIdUsuario(2);
		Paola.setCpf("44817816880");
		Paola.setNome("Paola Assis");
		Paola.setEmail("paola@email.com.br");
		Paola.setCelular(971278431);
		Paola.setLogin("assispaola");
		Paola.setSenha("123p");

		// Usuario 3
		Sonia.setIdUsuario(3);
		Sonia.setCpf("10083131817");
		Sonia.setNome("Sonia Regina Santos de Assis");
		Sonia.setEmail("sonia@email.com.br");
		Sonia.setCelular(968413813);
		Sonia.setLogin("assisonia");
		Sonia.setSenha("123s");

		// Usuario 4
		Rozana.setIdUsuario(4);
		Rozana.setCpf("01234567891");
		Rozana.setNome("Rozana Magalhães de Paiva");
		Rozana.setEmail("rozana@email.com.br");
		Rozana.setCelular(952368412);
		Rozana.setLogin("ropaiva");
		Rozana.setSenha("123r");

		// Usuario 5
		Malu.setIdUsuario(5);
		Malu.setCpf("44817816880");
		Malu.setNome("Malu Linda Assis");
		Malu.setEmail("malu@email.com.br");
		Malu.setCelular(971278431);
		Malu.setLogin("malulindinha");
		Malu.setSenha("123m");

		dao.insert(Bruno);
		dao.insert(Paola);
		dao.insert(Sonia);
		dao.insert(Rozana);
		dao.insert(Malu);

	}
}
