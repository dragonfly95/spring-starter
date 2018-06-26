package com.starter.sample;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.starter.sample.user.User;
import com.starter.sample.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	UserService userService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);


		List<User> users = userService.selectAllUsers();
		logger.info(users.toString());
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("user", users);
		return "home";
	}

	@RequestMapping(value = "addUser.do")
	public void addUser() {
		User user = new User();
		user.setId("id2");
		user.setUsername("username2");
		user.setPassword("password2");
		userService.insertUser(user);
	}



	
}
