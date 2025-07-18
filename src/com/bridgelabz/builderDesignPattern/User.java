package com.bridgelabz.builderPattern;

public class User {

    private final int userId;
    private final String userName;
    private final String userAddress;

    // Private constructor - only Builder can create instances
    private User(Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userAddress = builder.userAddress;
    }

    // Static nested Builder class
    public static class Builder {
        private final int userId;     // Required
        private String userName;      // Optional
        private String userAddress;   // Optional

        // Builder constructor with required field
        public Builder(int userId) {
            this.userId = userId;
        }

        // Setter-like methods for optional fields
        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserAddress(String userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        // Final build method
        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
