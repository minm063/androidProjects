package com.example.firebaseemailaccountexample;

/**
 *  사용자 계정 정보 모델 클래스
 */
public class UserAccount {
    
    private  String emailID; // 이메일 아이디
    private String password; // 비밀번호
    private String idToken; // Firebase UID(고유 토큰 정보)

    public UserAccount() {    }

    public String getIdToken() {
        return idToken;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }
}
