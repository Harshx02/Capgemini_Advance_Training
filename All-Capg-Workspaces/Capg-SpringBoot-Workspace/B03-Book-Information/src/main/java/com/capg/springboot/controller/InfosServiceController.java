package com.capg.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.springboot.dto.Book;
import com.capg.springboot.dto.Info;
import com.capg.springboot.dto.Rating;
@RestController
@RequestMapping("/info")
public class InfosServiceController {

    @Autowired
    RestTemplate rest ;

    @GetMapping("/list/{bookid}")
    public Book getAllData(@PathVariable("bookid") int id) {
        
        Rating rating = rest.getForObject("http://localhost:9092/rating/list",Rating.class);
        Info info = rest.getForObject("http://localhost:9093/category/list", Info.class);

        return new Book(1001, info.getBookName(), rating.getBookRating());
    }
}
