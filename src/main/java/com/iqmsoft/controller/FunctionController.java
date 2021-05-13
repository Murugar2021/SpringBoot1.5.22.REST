package com.iqmsoft.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.model.Func;
import com.iqmsoft.service.FuncService;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value = "/")
public class FunctionController {

    @Autowired
    private FuncService fservice;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/about", 
            method = RequestMethod.GET)
    public ResponseEntity getAbout() {
        return ResponseEntity.ok(fservice.getAbout());
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/func/{ID}", 
            method = RequestMethod.GET)
    public Func getFunc(@PathVariable("id") int id) {
        return fservice.getFunc(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/funcs", 
            method = RequestMethod.GET)
    public List<Func> getFuncs() {
        return fservice.getFuncs();
    }
   
    @RequestMapping(value = "/salaries", 
            method = RequestMethod.GET)
    public ResponseEntity<Map<String, Double>> getSalaries() {
        return new ResponseEntity<>(fservice.getSalaries(), 
                HttpStatus.OK);
    }
    
    @RequestMapping(value = "/salary/{ID}", 
            method = RequestMethod.GET)
    public ResponseEntity<Map<String, Double>> getSalary(@PathVariable("id") int id) {
        return new ResponseEntity<>(fservice.getSalary(id), 
                HttpStatus.OK);
    }
}
