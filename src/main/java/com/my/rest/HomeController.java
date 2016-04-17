package com.my.rest;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.my.rest.entity.Car;
import com.my.rest.entity.Image;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	
	/**
	 * rest metode
	 */
	
	@RequestMapping(value = "/api/info", method = RequestMethod.GET)
	public @ResponseBody String info() {
		logger.info("rest response");		
		return "Hi from rest";
	}
	
	@RequestMapping(value = "/api/car", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody Car cars() {
		logger.info("fetching car");	
		
		Car myCar=new Car();
		myCar.setName("Folksvagen");
		myCar.setValue("vrednost");
		return myCar;
	}
	
	@RequestMapping(value = "/api/getcar", method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody Car getCars(HttpServletRequest request) {
		logger.info("fetching car");	
		String na = request.getParameter("name");
		Car myCar=new Car();
		myCar.setName(na);
		myCar.setValue("vrednost");
		return myCar;
	}
	
	@RequestMapping(value = "/api/images", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Image> getImages() {
		logger.info("fetching images");	
		Image i1=new Image();
		i1.setPath("img/m1.jpg");
		Image i2=new Image();
		i2.setPath("img/m2.jpg");
		Image i3=new Image();
		i3.setPath("img/m3.jpg");
		List<Image> images=new ArrayList<Image>();
		images.add(i1);
		images.add(i2);
		images.add(i3);
		return images;
	}
	
}
