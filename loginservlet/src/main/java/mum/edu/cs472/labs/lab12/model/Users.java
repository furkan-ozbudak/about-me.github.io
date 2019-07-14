package mum.edu.cs472.labs.lab12.model;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private List<User> users = new ArrayList<>();
    {
        users.clear();
        users.add(new User("a","1","Gokhan Yildiz"));
        users.add(new User("b","2","Umur Karaca"));
        users.add(new User("c","3","Serhat Erturk"));
    }

    public Users() {
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User u){
        users.add(u);
    }
}
