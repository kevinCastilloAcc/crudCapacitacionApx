package com.example.crudCapacitacionApx.repositorio;

import com.example.crudCapacitacionApx.model.Student;
import com.example.crudCapacitacionApx.util.ConexionBaseDatos;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImp implements StudentRepository<Student> {

    //Get connection
    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }


    @Override
    public List<Student> findAll() {
//        System.out.println("Entrando a la implementación");
        List<Student> students = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")
        ) {
            while (rs.next()) {
                Student s = createStudent(rs);
                students.add(s);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    @Override
    public Student findById(Long id) {
        Student student = null;
        try (PreparedStatement stmt = getConnection()
                .prepareStatement("SELECT * FROM students WHERE id = ?")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    student = createStudent(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return student;
    }

    @Override
    public Student save(Student student) {
        String sql;
        if (student.getId() != null && student.getId() > 0) {
            //Update
            sql = "UPDATE students SET name = ?, date_of_birth = ?, grade_average = ? WHERE id = ?";
        } else {
            //save
            sql = "INSERT INTO students(name, date_of_birth, grade_average) VALUES(?,?,?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, student.getName());
            stmt.setDate(2, new Date((student.getDateOfBirth().getTime())));
            stmt.setLong(3, student.getDateAverage());
            if (student.getId() != null && student.getId() > 0) {
                stmt.setLong(4, student.getId());
            }
            stmt.executeUpdate();
            return student;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Long id) {
        try (PreparedStatement stmt = getConnection()
                .prepareStatement("DELETE FROM students WHERE id = ?")) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private Student createStudent(ResultSet rs) throws SQLException {
        Student s = new Student();
        s.setId(rs.getLong("id"));
        s.setName(rs.getString("name"));
        s.setDateOfBirth(rs.getDate("date_of_birth"));
        s.setDateAverage(rs.getLong("grade_average"));
        return s;
    }
}
