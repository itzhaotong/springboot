package zylsm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MvcConfig implements WebMvcConfigurer{
	
	public final static String Files = "C:\\MXD_Upload\\";

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/MXD_Upload/**").addResourceLocations("file:" + Files);
    }
}
