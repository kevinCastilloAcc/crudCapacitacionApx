package com.example.crudCapacitacionApx.controller;


import com.example.crudCapacitacionApx.model.Student;
import com.example.crudCapacitacionApx.repositorio.StudentRepository;
import com.example.crudCapacitacionApx.repositorio.StudentRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private StudentRepositoryImp studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> listadoUsuarios() {
//        var usuarios = usuarioRepository.findAll();
        var students = studentRepository.findAll();
        return ResponseEntity.ok(students);
    }
}
