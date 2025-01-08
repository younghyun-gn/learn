package spring.learn.domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// just declaring this interface takes care of CRUD stuff
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
