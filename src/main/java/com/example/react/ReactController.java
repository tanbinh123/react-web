package com.example.react;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReactController {

  @GetMapping(value = { "", "/" })
  public String index() {
    return "index";
  }
}



