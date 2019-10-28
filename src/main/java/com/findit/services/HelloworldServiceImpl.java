package com.findit.services;

import com.findit.documents.Helloworld;
import com.findit.repository.HelloworldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloworldServiceImpl implements HelloworldService {

    @Autowired
    private HelloworldRepository helloworldRepository;

    @Override
    public void saveDocument() {

        Helloworld helloworld = Helloworld.builder()
                .triggerId(123L)
                .source(111L)
                .segmentId(141L)
                .segmentType("vall")
                .uniqueId(526683L)
                .actions("{eventTitle=Logged_in_insid123, commType=1, content=You have logged in inside zone013, meta=null}")
                .build();
        helloworldRepository.save(helloworld);
    }

    @Override
    public List<Helloworld> getAllDocumentsBySegmentType(String value) {

        return helloworldRepository.findBySegmentType(value);
    }

    @Override
    public List<Helloworld> getAllDocumentsByTriggerId(String value) {

        return helloworldRepository.findByCustomQuery(value);
    }

    @Override
    public void deleteDocument() {

         helloworldRepository.deleteById(123L);
    }
}
