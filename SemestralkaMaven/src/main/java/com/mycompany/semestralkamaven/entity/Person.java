package com.mycompany.semestralkamaven.entity;
// Generated Apr 19, 2016 1:14:28 PM by Hibernate Tools 4.3.1



/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private int idOsoba;
     private String personName;
     private String personSurname;

    public Person() {
    }

	
    public Person(int idOsoba) {
        this.idOsoba = idOsoba;
    }
    public Person(int idOsoba, String personName, String personSurname) {
       this.idOsoba = idOsoba;
       this.personName = personName;
       this.personSurname = personSurname;
    }
   
    public int getIdOsoba() {
        return this.idOsoba;
    }
    
    public void setIdOsoba(int idOsoba) {
        this.idOsoba = idOsoba;
    }
    public String getPersonName() {
        return this.personName;
    }
    
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public String getPersonSurname() {
        return this.personSurname;
    }
    
    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }




}


