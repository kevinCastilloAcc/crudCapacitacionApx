package com.example.crudCapacitacionApx.repositorio;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Component
public interface StudentRepository<S>{

    List<S> findAll();
    S findById(Long id);

    void save(S s); //Save element or update

    void delete(Long id);


}
