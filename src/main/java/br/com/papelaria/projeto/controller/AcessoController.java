package br.com.papelaria.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcessoController {
	@GetMapping("/acesso/msg")
	public String msg() {
		return "Olá, você está no nosso ambiente";
	}
	
	@GetMapping("/acesso/lista")
	public List<String> lista(){
		
		List<String> lst = new ArrayList<String>();
		lst.add("Mouse");
		lst.add("João");
		lst.add("Nicolas");
		lst.add("Teclado");
		
		return lst;
		
		}
}