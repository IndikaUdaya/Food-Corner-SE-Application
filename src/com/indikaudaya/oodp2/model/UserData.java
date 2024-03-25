/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.indikaudaya.oodp2.model;

/**
 *
 * @author indika
 */
public class UserData {

    private final String userType;
    private final String userName;
    private final String mobile;
    private final String address;
    private final String status;
    private final String accountUserName;
    private final String password;

    private UserData(Builder builder) {
        this.userType = builder.userType;
        this.userName = builder.userName;
        this.mobile = builder.mobile;
        this.address = builder.address;
        this.status = builder.status;
        this.accountUserName = builder.accountUserName;
        this.password = builder.password;
    }

    public static class Builder {

        private String userType;
        private String userName;
        private String mobile;
        private String address;
        private String status;
        private String accountUserName;
        private String password;

        public Builder setUserType(String userType) {
            this.userType = userType;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setAccountUserName(String accountUserName) {
            this.accountUserName = accountUserName;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserData build() {
            return new UserData(this);
        }

    }

    public String getUserType() {
        return userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserData{" + "userType=" + userType + ", userName=" + userName + ", mobile=" + mobile + ", address=" + address + ", status=" + status + ", accountUserName=" + accountUserName + ", password=" + password + '}';
    }

}
