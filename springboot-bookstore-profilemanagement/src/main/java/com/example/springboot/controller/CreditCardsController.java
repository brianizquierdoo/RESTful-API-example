package com.example.springboot.controller;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.springboot.model.CreditCards;
//import com.example.springboot.repository.CreditCardsRepository;
//
//
//@RestController
//@RequestMapping("/api/v1/")
//public class CreditCardsController {
//	
//	@Autowired
//	private CreditCardsRepository creditcardRepository;
//	
//	@GetMapping("/credit_cards/search")
//	public List<CreditCards> getCreditCardsbyUsername(@RequestParam(name = "username", required = false) String username){
//		if(username != null) {
//			return this.creditcardRepository.getCreditCardsbyusername(username);
//		}
//		else {
//			return new ArrayList<>();		}
//	}
//		
//	
//
//
//}