package tc.wo.jeonghan.study.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tc.wo.jeonghan.study.domain.User;


public interface UserDao extends JpaRepository<User, String>{

}