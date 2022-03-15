package girolamo.linkdue.apirestboot.models.service;

import java.util.List;
import girolamo.linkdue.apirestboot.models.User;

public interface IUserService {
    User addUser(User user);
    User getUserById(int userId);
    void updateUser(User user);
    void deleteUserById(int userId);
    List<User> getAllUsers();
}