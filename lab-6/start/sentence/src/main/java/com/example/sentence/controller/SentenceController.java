package com.example.sentence.controller;


import com.example.sentence.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

    private final NounClient nounClient;
    private final AdjectiveClient adjectiveClient;
    private final ArticleClient articleClient;
    private final SubjectClient subjectClient;
    private final VerbClient verbClient;

    @Autowired
    public SentenceController(SubjectClient subjectClient, VerbClient verbClient,
                              ArticleClient articleClient, AdjectiveClient adjectiveClient,
                              NounClient nounClient){
        this.subjectClient = subjectClient;
        this.verbClient = verbClient;
        this.articleClient = articleClient;
        this.adjectiveClient = adjectiveClient;
        this.nounClient = nounClient;
    }

    @GetMapping("/sentence")
    public String getSentence(){

        String sentence = "Hay problemas con los microservicios";

        try{
            return String.format("%s %s %s %s %s.",
                    subjectClient.getWord().getWord(),
                    verbClient.getWord().getWord(),
                    articleClient.getWord().getString(),
                    adjectiveClient.getWord().getWord(),
                    nounClient.getWord().getString() );
        }catch (Exception ex){
            return sentence;
        }

    }


}
