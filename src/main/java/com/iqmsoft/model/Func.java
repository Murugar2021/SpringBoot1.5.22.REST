package com.iqmsoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Funcs")
public class Func {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;    
    private String name;
    private String surname;
    private String cpf;
    private Integer ddd;
    private Integer cellular;
    private String cargo;
    private Double salary;

    public Func() {
        super();
    }

    public Func(String name, String surname, String cpf, Integer ddd,
            Integer cellular, String cargo, Double salary) {
        super();
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
        this.ddd = ddd;
        this.cellular = cellular;
        this.cargo = cargo;
        this.salary = salary;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getCellular() {
        return cellular;
    }

    public void setCellular(Integer cellular) {
        this.cellular = cellular;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
