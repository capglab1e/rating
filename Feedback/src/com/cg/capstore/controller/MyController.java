package com.cg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.dto.Feedback;
import com.cg.capstore.sevice.ICapstoreService;

@Controller
public class MyController {
	
	@Autowired
	ICapstoreService service;
	
	public ICapstoreService getServe() {
		return service;
	}

	public void setServe(ICapstoreService serve) {
		this.service = serve;
	}

	@RequestMapping(value="home")
	public ModelAndView feedback(@ModelAttribute("mm") Feedback feedb)
	{
		System.out.println("home.obj request");
		return new ModelAndView("addFeedback");
	}
	
	/*@RequestMapping(value="newfeedback",method=RequestMethod.POST)
	public ModelAndView addFeed(@ModelAttribute("mm") Feedback feedb, BindingResult result){
		
		if(result.hasErrors())
			return new ModelAndView("addFeedback");
		else{
			serve.addFeedback(feedb);
			return new ModelAndView("success");
		}
	}*/
	
	@RequestMapping(value="avgrating")
	public String getFeedbackDetails(@ModelAttribute("mm") Feedback fb)
	{
		System.out.println("in controller");
		String pId = fb.getProductId();
		service.getFeedbackDetails(pId);
		return "success";

	}
	
	/*@RequestMapping(value="avgrating")
	public ModelAndView getFeedbackDetails(@ModelAttribute("mm") Feedback fb,@RequestParam("productId") String pId)
	{
		System.out.println("in controller");
		service.getFeedbackDetails(pId);
		return new ModelAndView("success");

	}
	*/
	@RequestMapping("updateProductRating")
	public String updateProductRating(@ModelAttribute("mm") Feedback feedback,Model model )					
	{
		service.updateProductRating(feedback);
		List<Feedback> list = service.getFeedbackDetails(feedback.getProductId()); 			//fetch data from database
		model.addAttribute("list",list);
		return "Product";
	}


}
