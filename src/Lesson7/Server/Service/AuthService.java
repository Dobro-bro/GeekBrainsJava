package Lesson7.Server.Service;

public interface AuthService {

    void start();

    String getNickByLoginPass(String login, String pass);

    void stop();

}