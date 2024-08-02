package com.example.crudCapacitacionApx.controller;


import com.example.crudCapacitacionApx.model.Student;
import com.example.crudCapacitacionApx.model.dto.StudentInDTO;
import com.example.crudCapacitacionApx.model.dto.StudentOutDTO;
import com.example.crudCapacitacionApx.model.dto.StudentUpdDTO;
import com.example.crudCapacitacionApx.repositorio.StudentRepositoryImp;
import com.example.crudCapacitacionApx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepositoryImp studentRepository;

    /*@Autowired
    private StudentService studentService;*/

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
//        var usuarios = usuarioRepository.findAll();
        var students = studentRepository.findAll();
        return ResponseEntity.ok(students);
    }

    @PostMapping
    public ResponseEntity<StudentOutDTO> createNewStudent(@RequestBody StudentInDTO studentInDTO,
                                                          UriComponentsBuilder uriComponentsBuilder) {
        System.out.println(studentInDTO + studentInDTO.getGrade_average());
        Student student = new Student(studentInDTO);
        Student studentSaved = studentRepository.save(student);

        StudentOutDTO studentOutDTO = new StudentOutDTO(studentSaved.getId(), studentSaved.getName(),
                studentSaved.getDateAverage());
        URI uri = uriComponentsBuilder.path("/students/{id}").buildAndExpand(studentSaved.getId()).toUri();
        System.out.println(studentSaved.getName() + " , creado correctamente");

        return ResponseEntity.created(uri).body(studentOutDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStudent(@PathVariable Long id) {
        Student student = studentRepository.findById(id);
        studentRepository.delete(student.getId());
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity updateStudent(@RequestBody StudentUpdDTO studentUpdDTO) {
        System.out.println(studentUpdDTO);
        Student student = studentRepository.findById(studentUpdDTO.getId());
        student.updateData(studentUpdDTO);
        Student studentUpdated = studentRepository.save(student);
        return ResponseEntity.ok(new StudentOutDTO(studentUpdated.getId(), studentUpdated.getName(),
                studentUpdated.getDateAverage()));
    }

}
