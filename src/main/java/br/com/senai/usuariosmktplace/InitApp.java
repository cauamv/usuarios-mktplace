package br.com.senai.usuariosmktplace;

import br.com.senai.usuariosmktplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		System.out.println(service.removerAcentoDo("Pedro de Alcântara"));
		System.out.println(service.fracionar("Pedro de Alcântara Francisco da Antônio dos João Carlos Xavier de Paula das Miguel Rafael Joaquim José Gonzaga Pascoal Cipriano Serafim de Bragança e Bourbon"));
		System.out.println(service.gerarLoginPor("Pedro de Alcântara Francisco da Antônio dos João Carlos Xavier de Paula das Miguel Rafael Joaquim José Gonzaga Pascoal Cipriano Serafim de Bragança e Bourbon"));
		System.out.println(service.gerarHashDa("jose123456"));
	}

}
