package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
 /*@RequestMapping("home")
 public String home(HttpServletRequest req)
 { 
   HttpSession session=req.getSession();
   String name=req.getParameter("name");
   System.out.println("Hi "+name);
   session.setAttribute("name", name);
   return "home"; 
 }*/
 /*@RequestMapping("home")
 public String home(@RequestParam("name") String myName,HttpSession session)
 { 
   
   System.out.println("Hi "+myName);
   session.setAttribute("name", myName);
   return "home"; 
 }*/
 /*	@RequestMapping("home")
	 public ModelAndView home(@RequestParam("name") String myName)
	 { 
	   ModelAndView mv=new ModelAndView();
	   mv.addObject("name",myName);
	   mv.setViewName("home");
	   System.out.println("Hi "+myName);
	   return mv; 
	 }*/
	@GetMapping("/home")
	public ModelAndView home(Alien alien)
	 { 
	   ModelAndView mv=new ModelAndView();
	   mv.addObject("ob",alien);
	   mv.setViewName("home");
	   System.out.println("Hi "+alien);
	   return mv; 
	 }
	@GetMapping("/shome")
	public String stringHome(Alien alien)
	 { 
	  String st="Hi "+alien.getAlienName();
	  System.out.println(st);
	  return st;
	 }
	@GetMapping("/wel")
	 public String welcomeHome()
	 {
	   String st="Welcome to home";
	   System.out.println(st);
	   return st;
	 }
}
