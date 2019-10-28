package com.findit.controller;

import com.findit.services.HelloworldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/solr/v1")
public class HelloworldController {

    @Autowired
    private HelloworldService helloworldService;

    @PostMapping(value = "/")
    public @ResponseBody ResponseEntity<?> addDocument() {
        helloworldService.saveDocument();
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(value = "/seg/{segment}")
    public @ResponseBody ResponseEntity<?> getDocumentBySegType(@PathVariable("segment") String segType) {
        return new ResponseEntity<>(helloworldService.getAllDocumentsBySegmentType(segType), HttpStatus.OK);
    }

    @GetMapping(value = "/trigId/{trig}")
    public @ResponseBody ResponseEntity<?> getDocumentByTriggerId(@PathVariable("trig") String trig) {
        return new ResponseEntity<>(helloworldService.getAllDocumentsByTriggerId(trig), HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    public @ResponseBody ResponseEntity<?> removeDocument() {
        helloworldService.deleteDocument();
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
