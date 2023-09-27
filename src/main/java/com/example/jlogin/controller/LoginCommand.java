package com.example.jlogin.controller;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginCommand {

    private Long empno;
    private String password;
    private boolean rememberEmpno;

//    public String getEmpno() {
//        return Empno;
//    }
//
//    public void setEmpno(String Empno) {
//        this.Empno = Empno;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
    public boolean getRememberEmpno() {
        return rememberEmpno;
    }
    public boolean isRememberEmpno(boolean rememberEmpno) {
        return rememberEmpno;
    }


}
