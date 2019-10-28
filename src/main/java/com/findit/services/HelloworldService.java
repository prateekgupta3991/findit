package com.findit.services;

import com.findit.documents.Helloworld;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HelloworldService {

    void saveDocument();

    List<Helloworld> getAllDocumentsBySegmentType(String segType);

    List<Helloworld> getAllDocumentsByTriggerId(String trig);

    void deleteDocument();
}
