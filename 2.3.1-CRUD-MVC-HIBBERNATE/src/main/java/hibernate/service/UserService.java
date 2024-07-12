package hibernate.service;

import hibernate.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User showUserById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);

    void updateUserById(long id, User user);
}
