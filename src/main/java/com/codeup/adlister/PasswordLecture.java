package com.codeup.adlister;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordLecture {


    public static void main(String[] args) {
        String password = "fido";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());

        System.out.println(password);
        System.out.println(hash);

        System.out.println("BCrypt.checkpw(password, hash) = " + BCrypt.checkpw(password, hash));
        System.out.println("BCrypt.checkpw('phoenix', hash) = " + BCrypt.checkpw("phoenix", hash));


    }
}
