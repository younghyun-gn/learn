package database.domain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// just declaring this interface takes care of CRUD stuff
interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
