package com.spring.boardPj.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.spring.boardPj.dao.BDao;
import com.spring.boardPj.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		BDao dao = new BDao();
		
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
	}

}
