package com.example.formulario_jv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.formulario_jv.entity.surcusalesP;
import com.example.formulario_jv.entity.userE;
import com.example.formulario_jv.service.surcuService;
import com.example.formulario_jv.service.userService;

@Controller
@RequestMapping
public class userController {
    @Autowired
    private userService userService;
    @Autowired
    private surcuService ss;

    @GetMapping("/index")
    public String home() {
        return "index";

    }

    @GetMapping("/")
    public String crear(Model model) {
        userE u = new userE();
        List<surcusalesP> sp = ss.listaSurc();
        model.addAttribute("user", u);
        model.addAttribute("surcu", sp);
        return ("index");
    }

    @PostMapping("/save")
    public String guardar(@ModelAttribute userE user) {
        userService.save(user);
        System.out.print("usuario guardado");
        return "msjGuardad";
    }

}
