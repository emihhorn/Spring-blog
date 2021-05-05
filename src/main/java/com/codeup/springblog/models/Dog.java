package com.codeup.springblog.models;


import javax.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 11)
    private long id;

    @Column(name="age", columnDefinition = "tinyint(3)",nullable = false)
    private short age;

    @Column(name="reside_state", length = 2, unique = true, columnDefinition = "XX")
    private String resideState;

    public Dog(long id, short age, String resideState) {
        this.id = id;
        this.age = age;
        this.resideState = resideState;
    }

    public Dog() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getResideState() {
        return resideState;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }
}
