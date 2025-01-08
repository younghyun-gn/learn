package database.domain;

import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    private @Id
    @GeneratedValue UUID id;
    private String name;
    private String role;


}
