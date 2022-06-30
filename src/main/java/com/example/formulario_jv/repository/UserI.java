package com.example.formulario_jv.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.formulario_jv.entity.userE;

@Repository
public interface UserI extends CrudRepository<userE, Long> {

}
