package com.example.formulario_jv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formulario_jv.entity.userE;
import com.example.formulario_jv.repository.UserI;

@Service
public class UService implements userService {
    @Autowired
    private UserI userI;

    @Override
    public void delete(Long id) {
        

    }

    @Override
    public List<userE> listar() {

        return (List<userE>) userI.findAll();
    }

    @Override
    public Optional<userE> listarId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(userE u) {
        userI.save(u);
        
    }

}
