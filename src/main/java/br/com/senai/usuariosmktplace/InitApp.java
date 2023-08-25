package br.com.senai.usuariosmktplace;

import br.com.senai.usuariosmktplace.core.dao.ManagerDb;
import br.com.senai.usuariosmktplace.core.domain.Usuario;

public class InitApp {

	public static void main(String[] args) {
		ManagerDb.getInstance().getConexao();
		System.out.println("Conectou");
		Usuario usuario = new Usuario("jose.silva", "José da Silva", "jose2023");
		usuario.getLogin();
	}

}
