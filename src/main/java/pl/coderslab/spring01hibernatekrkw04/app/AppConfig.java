package pl.coderslab.spring01hibernatekrkw04.app;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("pl.coderslab.spring01hibernatekrkw04")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
//    @Configuration
//    @EnableWebMvc
//    public class WebConfig implements WebMvcConfigurer {
//        @Override
//        public void addCorsMappings(CorsRegistry registry) {
//            registry.addMapping("/**")
//                    .allowedMethods("GET", "POST", "PUT", "DELETE");
////                    .allowedOrigins("http://localhost");
//        }
//    }
}
