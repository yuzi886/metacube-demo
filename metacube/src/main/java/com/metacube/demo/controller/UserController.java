package com.metacube.demo.controller;

import com.metacube.demo.entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.metacube.demo.dao.UserService;
import javax.servlet.http.HttpServletRequest;  

import org.springframework.stereotype.*;    



@Controller
//@ResponseBody
//@RequestMapping(value = "/", produces = { MediaType.TEXT_HTML_VALUE })
//@RequestMapping("/users")
public class UserController {
	
	@GetMapping
    String test(Model model) {  
        //逻辑处理  
        model.addAttribute("something","this is a test");
        return "index";  
    } 
	/*@Autowired
	private UserService userService;
	
	@GetMapping("/templates")
    String test(HttpServletRequest request) {  
        //逻辑处理  
        request.setAttribute("key", "hello world");  
        return "index";  
    }  
	
	@PostMapping(value = "/signIn",  consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String UserSignIn(@RequestBody @Valid @ModelAttribute User user, BindingResult errors,
			Model model, RedirectAttributes redirectAttrs) {

		if (errors.hasErrors()) {
			//model.addAttribute("venues", venueService.findAll());
			//model.addAttribute("User", user);
			return "users/signIn";
		}

		//userService.save(user);
		//redirectAttrs.addFlashAttribute("ok_message", "User sign in ");//do not know how to do 

		return "redirect:/";
	}
	
	@PostMapping(value = "/logIn",  consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String UserLogIn(@RequestBody @Valid @ModelAttribute User user, BindingResult errors,
			Model model, RedirectAttributes redirectAttrs) {

		if (errors.hasErrors()) {
			//model.addAttribute("venues", venueService.findAll());
			//model.addAttribute("User", user);
			return "users/signIn";
		}

		//userService.save(user);
		//redirectAttrs.addFlashAttribute("ok_message", "User sign in ");//do not know how to do 

		return "redirect:/";
	}*/

}
