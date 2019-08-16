package com.undec.planestudio.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Course {
    private Integer id;
    private String code;
    private String name;
    private String year;
    private String regime;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "regime")
    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) &&
                Objects.equals(code, course.code) &&
                Objects.equals(name, course.name) &&
                Objects.equals(year, course.year) &&
                Objects.equals(regime, course.regime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, year, regime);
    }
}
