package com.webproject.bookstore.model.dal.hibrnate.entities;
// Generated Mar 22, 2019 5:44:23 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BookOrderId generated by hbm2java
 */
@Embeddable
public class BookOrderId  implements java.io.Serializable {


     private int orderId;
     private int bookId;

    public BookOrderId() {
    }

    public BookOrderId(int orderId, int bookId) {
       this.orderId = orderId;
       this.bookId = bookId;
    }
   


    @Column(name="orderID", nullable=false)
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
		 if ( !(other instanceof BookOrderId) ) return false;
		 BookOrderId castOther = ( BookOrderId ) other; 
         
		 return (this.getOrderId()==castOther.getOrderId())
 && (this.getBookId()==castOther.getBookId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrderId();
         result = 37 * result + this.getBookId();
         return result;
   }   


}


