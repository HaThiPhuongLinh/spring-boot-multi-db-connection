package vn.edu.fit.iuh.multipledatabasespring.primary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.fit.iuh.multipledatabasespring.primary.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}