package com.mycompany.semestralkamaven.entity;
// Generated Apr 19, 2016 1:14:28 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Reader generated by hbm2java
 */
@Entity
@Table(name = "Reader")
@Access(value = AccessType.FIELD)
public class Reader implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReader;
    
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign", parameters = { @Parameter(name = "property", value = "person") })
    private int idPerson;
    
    private Date regFrom;
    
    private Date regTo;

    public Reader() {
    }

    public Reader(int idReader, int idPerson, Date regFrom) {
        this.idReader = idReader;
        this.idPerson = idPerson;
        this.regFrom = regFrom;
    }

    public Reader(int idReader, int idPerson, Date regFrom, Date regTo) {
        this.idReader = idReader;
        this.idPerson = idPerson;
        this.regFrom = regFrom;
        this.regTo = regTo;
    }

    public int getIdReader() {
        return this.idReader;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
    }

    public int getIdPerson() {
        return this.idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public Date getRegFrom() {
        return this.regFrom;
    }

    public void setRegFrom(Date regFrom) {
        this.regFrom = regFrom;
    }

    public Date getRegTo() {
        return this.regTo;
    }

    public void setRegTo(Date regTo) {
        this.regTo = regTo;
    }

}
