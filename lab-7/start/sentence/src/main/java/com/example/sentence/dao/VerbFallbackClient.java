package com.example.sentence.dao;

import com.example.sentence.model.Word;
import org.springframework.stereotype.Component;

@Component
public class VerbFallbackClient implements VerbClient {

    @Override
    public Word getWord() {
        return new Word("XXX");
    }
}
