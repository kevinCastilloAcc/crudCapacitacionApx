package com.example.crudCapacitacionApx.model.validations;

import com.example.crudCapacitacionApx.model.dto.StudentInDTO;
import org.springframework.stereotype.Component;

@Component
public class DuplicateName implements StudentValidations {

    @Override
    public void validar(StudentInDTO studentInDTO) {

    }
}
