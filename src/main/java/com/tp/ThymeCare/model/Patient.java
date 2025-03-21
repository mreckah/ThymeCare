package com.tp.ThymeCare.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="patients")
@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private boolean sick;
    private int score;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", sick=" + sick +
                ", score=" + score +
                '}';
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
