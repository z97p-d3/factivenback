package com.componente.factinven.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class UiApplication {

  @RequestMapping("/user")
  public Principal user(Principal user) {
	  
    return user;
  }
}