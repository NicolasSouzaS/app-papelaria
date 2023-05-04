package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Usuario;
import br.com.papelaria.projeto.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	//Variavel de ações dentro do banco de dados
	//Auto instância da interface em tempo de execução
	@Autowired
	private UsuarioRepository ur;
	
	@GetMapping("/usuario/listar")
	public List<Usuario> listar() {
		
		return ur.findAll();
	}
	
	@PostMapping("/usuario/cadastrar")
	public String cadastrar(@RequestBody Usuario us) {
		String msg = "";
		ur.save(us);
		
		msg = "Cadastrou";
		
		return msg;
	}

}
