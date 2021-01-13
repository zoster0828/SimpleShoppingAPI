package com.zoster.SimpleShoppingAPI.boot;

import com.zoster.SimpleShoppingAPI.SimpleShoppingApiApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SimpleShoppingApiApplication.class);
	}

}
