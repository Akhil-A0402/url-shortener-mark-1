package com.reliablelink.urltrim.shortener.service;

import com.reliablelink.urltrim.shortener.dto.CreateNewShortUrlRequestDto;

public interface ShortenerService {
    Object createNewShortUrl(CreateNewShortUrlRequestDto createNewShortUrlRequestDto);
}
