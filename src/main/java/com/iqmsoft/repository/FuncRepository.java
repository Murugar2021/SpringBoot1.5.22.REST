package com.iqmsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.model.Func;

@Repository("funcRepository")
public interface FuncRepository extends JpaRepository<Func, Integer> {
}
