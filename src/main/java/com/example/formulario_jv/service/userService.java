package com.example.formulario_jv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.formulario_jv.entity.userE;
@Service
public interface userService {

    public List<userE> listar();

    public Optional<userE> listarId(Long id);

    public void save(userE u);

    public void delete(Long id);

}
