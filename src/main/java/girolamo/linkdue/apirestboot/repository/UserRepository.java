package girolamo.linkdue.apirestboot.repository;


import girolamo.linkdue.apirestboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
