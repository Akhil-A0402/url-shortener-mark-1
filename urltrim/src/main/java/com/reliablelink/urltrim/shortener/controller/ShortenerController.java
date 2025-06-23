package com.reliablelink.urltrim.shortener.controller;

import com.reliablelink.urltrim.shortener.dto.CreateNewShortUrlRequestDto;
import com.reliablelink.urltrim.shortener.service.ShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shortener")
public class ShortenerController {

    @Autowired
    private final ShortenerService shortenerService;

    public ShortenerController(ShortenerService shortenerService) {
        this.shortenerService = shortenerService;
    }


    @PostMapping("/create")
    public Object createNewShortUrl(CreateNewShortUrlRequestDto createNewShortUrlRequestDto) {
        try{
            //todo
            shortenerService.createNewShortUrl(createNewShortUrlRequestDto);
        } catch (Exception e) {
            // todo
        }
        return null;
    }
}
