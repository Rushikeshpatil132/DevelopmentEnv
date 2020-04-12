package com.platform.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.Product;
import com.platform.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public String search() {
		System.out.println("index called");
		List<Product> s = productService.search("mobile 1");
		System.out.println(s);
		return "index";
	}

	@RequestMapping(value = "/search" , method = RequestMethod.GET)
	@ResponseBody
	public List<Product> searchProcuct(@RequestParam(value="term") String term) {
		System.out.println("ProductController.searchProcuct()"+ term);
		return productService.search(term);
	}
	
	@RequestMapping(value = "/mail/{mails}",method = RequestMethod.GET)
	public void checkmail(@PathVariable("mails") String mails) {
		System.out.println("ProductController.checkmail()");
		System.out.println(mails);
	}
}
