package com.antonio.shortlink.controller;

import com.antonio.shortlink.Modal.Url;
import com.antonio.shortlink.Service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;

@RestController
@RequestMapping("/Url")

public class UrlController {
   @Autowired
     private UrlService urlService;



    @GetMapping("/{id}")


    public String getOriginalUrl(@PathVariable String id){
        return urlService.getOriginalUrl(id);

    }

    @PostMapping

    public Url genarateShortlink (@RequestBody String url){
        return urlService.genarateShortlink(url);
    }
}
