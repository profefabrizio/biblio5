package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index(@RequestParam(defaultValue = "Visitante")String nombre){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return "<html>"+
            "<body style='background: linear-gradient(to bottom right, blue, pink)'>"+
            "<h1>Hola "+nombre+" </h1>"+
            "<p>Este es tu primer sprin </p>"+
            "<p>Hoy es : "+ahora.format(formato)+" </p>"+
            "</body>"+
            "</html>" ;
    }
}
