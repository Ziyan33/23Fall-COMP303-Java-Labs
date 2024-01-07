package com.vinay.spring.mvc;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller	
public class MainController {
	
     
	    @GetMapping("/register")
	    public String showForm(Model model) {
	        User user = new User();
	        model.addAttribute("user", user);
	         
	        List<String> listState = Arrays.asList("ON", "QC", "MB");
	        model.addAttribute("listState", listState);
	            
	        Phone phone=new Phone();
	        model.addAttribute("phone", phone);
		    
	        List<String> listBrand = Arrays.asList("iphone", "samsung");
	        model.addAttribute("listBrand", listBrand);
	        
	        List<String> listModel = Arrays.asList("XR", "Pro", "XPro");
	        model.addAttribute("listModel", listModel);
	        
	        List<String> listQuantity = Arrays.asList("1", "2", "3");
	        model.addAttribute("listQuantity", listQuantity);
	        
	        return "register_form";
	    }
	    @PostMapping("/register")
	    public String submitForm(@ModelAttribute("user") User user,@ModelAttribute("phone")Phone phone,Model model) {
	        System.out.println(user);
	        System.out.println(phone) ;
	        
	        double unitPrice = phone.getPriceForModel(phone.getpModel());
	        double totalPrice = unitPrice * Integer.parseInt(phone.getpQuantity());
	        
	        phone.setpTotalPrice(String.valueOf(totalPrice));

	        model.addAttribute("phone", phone);
	        return "register_success";
	        
	    }
	    @Controller
	    public class ImageController {
	        @GetMapping("/showImage")
	        public String showImagePage() {
	            return "imagePage"; 
	        }
	    }


}
