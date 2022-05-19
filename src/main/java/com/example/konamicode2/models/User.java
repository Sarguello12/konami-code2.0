package com.example.konamicode2.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String password;
    private int winRecord;
    private int lossRecord;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, int winRecord, int lossRecord) {
        this.username = username;
        this.password = password;
        this.winRecord = winRecord;
        this.lossRecord = lossRecord;
    }

    public User(User copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        username = copy.username;
        password = copy.password;
        winRecord = copy.winRecord;
        lossRecord = copy.lossRecord;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getWinRecord() {
        return winRecord;
    }

    public int getLossRecord() {
        return lossRecord;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWinRecord(int winRecord) {
        this.winRecord = winRecord;
    }

    public void setLossRecord(int lossRecord) {
        this.lossRecord = lossRecord;
    }
}
