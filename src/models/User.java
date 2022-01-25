package models;

public class User {
    public static String name;
    public static String code;
    public static String password;

    public static void setName(String name) {
        User.name = name;
    }

    public static void setCode(String code) {
        User.code = code;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static String getName() {
        return name;
    }

    public static String getCode() {
        return code;
    }

    public static String getPassword() {
        return password;
    }
}
