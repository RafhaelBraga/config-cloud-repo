package br.com.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Controller {
    
    @Value("${user.role}")
    private String role;
    
    @Value("${user.password}")
    private String password;

	@GetMapping(value = "/{username}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello(@PathVariable("username") String username) {
        return String.format("Hello! "+ username +", "+ role +", "+ password);
    }
}
