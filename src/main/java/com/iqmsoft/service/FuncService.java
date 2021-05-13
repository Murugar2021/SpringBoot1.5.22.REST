package com.iqmsoft.service;

import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;

import com.iqmsoft.model.Func;

public interface FuncService {

    String getAbout();
    Func getFunc(int id);
    List<Func> getFuncs();
    Map<String, Double> getSalaries();
    Map<String, Double> getSalary(int id);
}
