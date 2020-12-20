package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Employee;

public class EmployeeValidator {
    public static List<String> validate(Employee e ,Boolean codeDuplicateCheckFlag, Boolean passwordCheckFlag) {
        List<String> errors = new ArrayList<String>();

        String code_error=validateCode(e.getCode(),codeDuplicateCheckFlag);
        if(!code_error.equals("")){
            errors.add(code_error);
        }

        String name_error=validateName(e.getName());
        if(!name_error.equals("")){
            errors.add(name_error);
        }

        String password_error=validatePassword(e.getPassword(),passwordCheckFlag);
         if(!password_error.equals("")) {
         errors.add(password_error);
        }

        return errors;

    }


}
