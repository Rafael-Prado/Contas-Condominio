package com.prado.contas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prado.contas.model.Titulo;
import com.prado.contas.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TitulosController {
	
	@Autowired
	private Titulos titulos;
	
	@RequestMapping("/novo")
	public String novo(){	
		return "CadastroTitulo";
	}
	
	@RequestMapping(method =RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo){
		titulos.save(titulo);
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Título salvo com sucesso!!");
		return mv;
	}
	
	
}
