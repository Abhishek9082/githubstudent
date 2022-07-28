package c2tc.batch.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Student_Repository extends JpaRepository <Student, Integer>
{

}

