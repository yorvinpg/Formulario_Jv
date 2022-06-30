package com.example.formulario_jv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formulario_jv.entity.surcusalesP;
import com.example.formulario_jv.repository.surcuR;

@Service
public class surcuService implements SService {
    @Autowired
    private surcuR sr;

    @Override
    public List<surcusalesP> listaSurc() {
        return (List<surcusalesP>) sr.findAll();
    }

}
