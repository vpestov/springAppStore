package dao;

import com.springAppStore.models.User;
import mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    public User getUser(String login){
        final String query = "select * from USERS where login = ?";
        return (User) jdbcTemplate.queryForObject(query,
                new Object[]{login}, userMapper);

    }

}
