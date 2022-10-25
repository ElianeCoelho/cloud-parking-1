package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {
//Passei por aqui...Eliane Coelho
    @GetMapping
    public String hello(){
        return "Hello DIO. Feito por professor Sandro e por Eliane Coelho";
    }

}
