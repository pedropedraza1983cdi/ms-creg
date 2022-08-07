package com.nttdata.terpel.mscreg.controller;

import com.nttdata.terpel.mscreg.model.Envelope;
import com.nttdata.terpel.mscreg.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${service.controller.path}")
public class Controller {

    @Autowired
    private ExampleService service;

    @PostMapping(path = "/services/creg", consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Object> getExampleModel(@RequestBody Envelope request) {
        return service.constructExample(request);
    }

}