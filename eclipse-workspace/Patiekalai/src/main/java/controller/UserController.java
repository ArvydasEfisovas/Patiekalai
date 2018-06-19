package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Patiekalas;
import service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	public UserService userService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("patiekalai",userService.getAll());
		 
		return "index";
	}
	
	
	@GetMapping("/patiekalas/{id}")
	public String getById(@PathVariable("id") int id,Model model) {
		model.addAttribute("patiekalas",userService.getById(id));
		return "showPatiekalas";
	}
	@PostMapping("/addPatiekalas")
		public String addUser(@Valid Patiekalas patiekalas,BindingResult bindingResult,Model model) {
		if(!bindingResult.hasErrors()) {
			model.addAttribute("noErrors",true);
			userService.save(patiekalas);
		}
		
			return "createPatiekalas";
	}
	@GetMapping("/addPatiekalas")
		public String createUserPage(Model model) {
		model.addAttribute("patiekalas",new Patiekalas());
		
			return "createPatiekalas";
	}
	@GetMapping("/update/{id}")
		public String update(@PathVariable("id") int id, Model model) {
			model.addAttribute("patiekalas",userService.getById(id));
			return "editPatiekalas";
	}
	@PostMapping("/updatePatiekalas")
		public String updateUser(@ModelAttribute("patiekalas") Patiekalas patiekalas) {
			userService.update(patiekalas);
			return "redirect:/patiekalas/" + patiekalas.getId();
	}
	@GetMapping("/delete/{id}")
		public String delete (@PathVariable("id") int id) {
			userService.delete(id);
			return "redirect:/";
	}
	
}
