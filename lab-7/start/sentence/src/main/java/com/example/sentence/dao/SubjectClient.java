package com.example.sentence.dao;

import com.example.sentence.model.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SUBJECT")
public interface SubjectClient {

    @GetMapping("/")
    Word getWord();
}
