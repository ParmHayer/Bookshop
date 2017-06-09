package com.qa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qa.models.Book;
import com.qa.models.Customer;
import com.qa.services.BookService;
import com.qa.services.CustomerService;

@Controller
@ComponentScan({"com.qa.models", "com.qa.repositories", "com.qa.services"})
@EntityScan("com.qa.models")
public class MyController {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/")
	public String hello()
	{
		return "welcome";
	}
	
	@RequestMapping("/register")
	public String register()
	{
		return "register_user";
	}
	
	@RequestMapping("/registeruser")
	public String registrationProcess(@ModelAttribute Customer c)
	{
		if(!c.getFirstname().equals("") && !c.getLastname().equals("") && !c.getEmail().equals("") && !c.getPassword().equals(""))
		{
			customerService.createCustomerRecord(c);
			System.out.println("Valid Input");
			return "reg_success";
			
		}
			else
		{
			System.out.print("Invalid Input");
			return "reg_failed";
		}
	}
	
	
	@RequestMapping("/bookform")
	public String books()
	{
		return "registerbook";
	}
	
	@RequestMapping("/addbook")
	public String addBookProcess(@ModelAttribute Book b)
	{
		bookService.createBookRecord(b);
		return "bookadded";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/loginprocess")
	public String loginProcess(@ModelAttribute Customer c)
	{
			Customer customer = customerService.checkEmailAndPassword(c.getEmail(), c.getPassword());
			
			if(customer!=null ){
			System.out.println("Valid Input");
			return "login_success";
			}
			else
		{
			System.out.print("Invalid Input");
			return "login_failed";
		}
	}
	
	@RequestMapping("/viewbooks")
	public String viewbooks(Model model)
	{
		Iterable<Book>allBooks=bookService.getAllBooks(); model.addAttribute("allBooks", allBooks);
		return "viewbooks";
		
//		Iterable<Book>bookname=bookService.getAllBooksByBookname(); model.addAttribute("bookname", bookname);
	}
	
}
