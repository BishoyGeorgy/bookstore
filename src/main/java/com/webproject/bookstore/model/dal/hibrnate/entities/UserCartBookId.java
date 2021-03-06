package com.webproject.bookstore.model.dal.hibrnate.entities;
// Generated Mar 22, 2019 5:44:23 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserCartBookId generated by hbm2java
 */
@Embeddable
public class UserCartBookId  implements java.io.Serializable {


     private int userId;
     private int bookId;

    public UserCartBookId() {
    }

    public UserCartBookId(int userId, int bookId) {
       this.userId = userId;
       this.bookId = bookId;
    }
   


    @Column(name="userID", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


    @Column(name="bookID", nullable=false)
    public int getBookId() {
        return this.bookId;
    }
    
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserCartBookId) ) return false;
		 UserCartBookId castOther = ( UserCartBookId ) other; 
         
		 return (this.getUserId()==castOther.getUserId())
 && (this.getBookId()==castOther.getBookId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserId();
         result = 37 * result + this.getBookId();
         return result;
   }   


}


