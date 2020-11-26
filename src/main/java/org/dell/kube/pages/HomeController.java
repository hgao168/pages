package org.dell.kube.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private Config config;


    //private String pageContent;

    public HomeController(){}

    //public HomeController(@Value("${page.content}") String pageContent){
        //this.pageContent=pageContent;
   // }

    @GetMapping
    public String getPage(){
        return "Hello from page : "+config.getMessage()+" ";
    }
}