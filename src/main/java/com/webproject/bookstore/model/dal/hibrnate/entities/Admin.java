package com.webproject.bookstore.model.dal.hibrnate.entities;
// Generated Mar 22, 2019 5:44:23 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name="admin"
    ,catalog="bookstoredb"
)
public class Admin  implements java.io.Serializable {


     private int adminId;
     private String name;
     private String password;

    public Admin() {
    }
    
    public Admin(int adminId, String name, String password) {
       this.adminId = adminId;
       this.name = name;
       this.password = password;
    }
   
     @Id 

    
    @Column(name="adminID", unique=true, nullable=false)
    public int getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    
    @Column(name="name", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="password", nullable=false, length=30)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


