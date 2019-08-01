package com.cesi.spring.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;

@Table(name = "people")
@EntityListeners(AuditingEntityListener.class)
@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //(Hibernate) @GeneratedValue déclare l'id comme étant auto-incrémenté
    protected Integer id;

    @Column
    protected String name;

    @Column
    protected String sex;

    @Column
    protected String type;


    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() { return sex;}

    public void setSex(String sex) { this.sex = sex; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
