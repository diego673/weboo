package cl.tswool.lab.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.tswool.lab.app.models.customers;
import cl.tswool.lab.app.repositories.customersRepository;
import cl.tswool.lab.app.repositories.packagesRepository;

@Controller
public class customerController {

	@Autowired
	customersRepository customerRepository;
	
	@Autowired
	packagesRepository packageRepository;
	
	@GetMapping("/index")
	public String index(Model modelo) {
		modelo.addAttribute("usuario",new customers());
		modelo.addAttribute("usuarios",customerRepository.findAll());
		modelo.addAttribute("paquetes",packageRepository.findAll());
		return "index";
	}
}