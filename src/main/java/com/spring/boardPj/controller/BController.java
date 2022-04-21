package com.spring.boardPj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boardPj.command.*;


@Controller
public class BController {
	
	BCommand command = null;
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	
	@RequestMapping(value = "/write_view")
	public String write_view() {
		
		return "write_view";
	}
	
	@RequestMapping(value = "/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BContentCommand();
		command.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping(value = "/reply_view")
	public String reply_view() {
		
		return "reply_view";
	}
	
	@RequestMapping(value = "/write")	//기능 완료후 list로 돌아감
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/reply")
	public String reply() {
		
		return "redirect:list";
	}
	

}
