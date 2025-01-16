package com.cangzhousc.mydemo1.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class User {
    private int id;
    private String name;
    private Timestamp birthday;
    private BigDecimal amount;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Timestamp birthday) {this.birthday = birthday; };

    public Timestamp getBirthday() {return birthday;};

    public void setAmount(BigDecimal amount) { this.amount = amount; };

    public BigDecimal getAmount() {return amount;};

}
