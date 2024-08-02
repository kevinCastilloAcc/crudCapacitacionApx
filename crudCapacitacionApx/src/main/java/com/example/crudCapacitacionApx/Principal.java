package com.example.crudCapacitacionApx;

import com.example.crudCapacitacionApx.model.Student;
import com.example.crudCapacitacionApx.repositorio.StudentRepository;
import com.example.crudCapacitacionApx.repositorio.StudentRepositoryImp;
import com.example.crudCapacitacionApx.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class Principal {

    public void mostrarMenu(){

        try (Connection conn = ConexionBaseDatos.getInstance()) {
            System.out.println("Conexión realizada exitosamente");
            StudentRepository<Student> studentRepository = new StudentRepositoryImp();

            //=============== LISTAR ===========
            studentRepository.findAll().forEach(System.out::println);

            //============== Por ID ========
            System.out.println(studentRepository.findById(1L));
            System.out.println("Finalizando");

            //=============== DELETE =========
            //studentRepository.delete(2L);

            //============== SAVE ==========
            Student myStudent = new Student();
            myStudent.setName("Kevin Castillo");
            myStudent.setDateOfBirth(new Date(1996,12,15));
            myStudent.setDateAverage(9L);
            studentRepository.save(myStudent);

            //=========== UPDATE ============
            /*Student myStudent2 = studentRepository.findById(1L);
            System.out.println(myStudent2.getId());
            myStudent2.setName("Juanito Puerquito");
            studentRepository.save(myStudent2);*/

            //=============== LISTAR ===========
            studentRepository.findAll().forEach(System.out::println);


        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
}
