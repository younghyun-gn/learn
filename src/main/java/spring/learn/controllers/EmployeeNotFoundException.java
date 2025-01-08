package spring.learn.controllers;

import java.util.UUID;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(UUID id) {
        super("Could not find any employees by the ID " + id);
    }
}
