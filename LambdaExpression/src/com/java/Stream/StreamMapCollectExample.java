package com.java.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Let's understand why we need to use map...

    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("a","b","c","d");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha)
            alphaUpper.add(s.toUpperCase());

        System.out.println(alpha); // [a,b,c,d]
        System.out.println(alphaUpper); // [A,B,C,D]

        // Java8
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); // [A,B,C,D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n*2).collect(Collectors.toList());
        System.out.println(collect1); //[2,4,6,8,10]

    }

 */


public class StreamMapCollectExample {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1,"Ramesh","secret","ramesh@github.com"));
        users.add(new User(2,"Varun","secret","varun@github.com"));
        users.add(new User(3,"Kiran","secret","kiran@github.com"));

        // traditional method of mapping
        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        for (User user : users){
            usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
        }

        for (UserDTO dto : usersDTO){
            System.out.println(dto);
        }

        System.out.println("--------------------------------------------------------------");

        // using stream().map()

//       users.stream().map(new Function<User, UserDTO>() {
//
//            @Override
//            public UserDTO apply(User user) {
//                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
//            }
//        }).forEach(userDTO -> System.out.println(userDTO));


        // using lambda expression
        users.stream().map((User user) ->
                new UserDTO(user.getId(), user.getUserName(), user.getEmail())).forEach((userDTO -> System.out.println(userDTO)));

        // If we want to store this data

//        List<UserDTO> usersDTO2 = users.stream().map((User user) ->
//                new UserDTO(user.getId(), user.getUserName(), user.getEmail())).collect(Collectors.toList());
//        usersDTO2.forEach(System.out::println);


    }

}

// Not mentioned password here, because we are not going to send password to client

class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
