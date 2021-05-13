package com.iqmsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.model.Func;
import com.iqmsoft.repository.FuncRepository;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;

@Service("funcionarioService")
public class FuncServiceImpl implements FuncService {

    @Autowired
    FuncRepository frepos;

    @Override
    public String getAbout() {
        return "THIS IS A TEST";
    }

    @Override
    public Func getFunc(int id) {
        return frepos.findOne(id);
    }

    @Override
    public List<Func> getFuncs() {
        return frepos.findAll();
    }

    @Override
    public Map<String, Double> getSalary(int id) {
    Map<String, Double> result = new HashMap<>();
        result.put(frepos.findOne(id).getName()
                + " " + frepos.findOne(id).getSurname(),
                frepos.findOne(id).getSalary());
        return result;
    }

    @Override
    public Map<String, Double> getSalaries() {
        Map<String, Double> result = new HashMap<>();

        Double soma = frepos.findAll()
                .stream()
                .map(x -> x.getSalary())
                .reduce(0.0, Double::sum);
        
        result.put("Salaries", soma);
        return result;      
    }
}
