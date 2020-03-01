package tc.wo.jeonghan.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tc.wo.jeonghan.study.dao.UserDao;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Object getUser(String id){
        return userDao.getOne(id);
    }
}
