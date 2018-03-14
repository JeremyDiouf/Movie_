package com.example.demo;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private long year;
    private String description;

    @ManyToMany
    @JoinTable(
            name ="movie_actor",
            joinColumns=@JoinColumns(name="MOVIE_ID", referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name="ACTOR_ID",
            referencedColumnName = "ID"))
            private Set<Actor> cast;
            public void addActor=(Actor a);
             {cast.add(a);}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
