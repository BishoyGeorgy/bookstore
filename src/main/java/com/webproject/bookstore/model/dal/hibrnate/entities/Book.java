package com.webproject.bookstore.model.dal.hibrnate.entities;
// Generated Mar 22, 2019 5:44:23 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Book generated by hbm2java
 */
@Entity
@Table(name="book"
    ,catalog="bookstoredb"
)
public class Book {

    
     private Integer bookId;
     private Category category;
     private Offer offer;
     private String title;
     private String description;
     private String authorName;
     private double price;
     private String img;
     private int visits;
     private double rate;
     private int quantity;
     private int pagesNumber;
     private int soldAmount;
     private int imgsCount;
     private boolean available;
     private String keys;
     private Set<UserVisitBook> userVisitBooks = new HashSet<UserVisitBook>(0);
     private Set<BookOrder> bookOrders = new HashSet<BookOrder>(0);
     private Set<User> users = new HashSet<User>(0);
     private Set<UserCartBook> userCartBooks = new HashSet<UserCartBook>(0);
     
     private int reviews=1;
    public Book() {
    }

	
    public Book(Category category, Offer offer, String title, String description, String authorName, double price, String img, int visits, double rate, int quantity, int pagesNumber, int soldAmount, boolean available, String keys,int imgsCount) {
        this.category = category;
        this.offer = offer;
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.price = price;
        this.img = img;
        this.visits = visits;
        this.rate = rate;
        this.quantity = quantity;
        this.pagesNumber = pagesNumber;
        this.soldAmount = soldAmount;
        this.available = available;
        this.keys = keys;
        this.imgsCount=imgsCount;
    }
    public Book(Category category, Offer offer, String title, String description, String authorName, double price, String img, int visits, double rate, int quantity, int pagesNumber, int soldAmount, boolean available, String keys, Set<UserVisitBook> userVisitBooks, Set<BookOrder> bookOrders, Set<User> users, Set<UserCartBook> userCartBooks) {
       this.category = category;
       this.offer = offer;
       this.title = title;
       this.description = description;
       this.authorName = authorName;
       this.price = price;
       this.img = img;
       this.visits = visits;
       this.rate = rate;
       this.quantity = quantity;
       this.pagesNumber = pagesNumber;
       this.soldAmount = soldAmount;
       this.available = available;
       this.keys = keys;
       this.userVisitBooks = userVisitBooks;
       this.bookOrders = bookOrders;
       this.users = users;
       this.userCartBooks = userCartBooks;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="bookID", unique=true, nullable=false)
    public Integer getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="categoryID", nullable=false)
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="offerID", nullable=false)
    public Offer getOffer() {
        return this.offer;
    }
    
    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    
    @Column(name="title", nullable=false, length=200)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="descripe", nullable=false, length=1000)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="authorName", nullable=false, length=100)
    public String getAuthorName() {
        return this.authorName;
    }
    
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    
    @Column(name="price", nullable=false, precision=22, scale=0)
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    
    @Column(name="img", nullable=false, length=50)
    public String getImg() {
        return this.img;
    }
    
    public void setImg(String img) {
        this.img = img;
    }

    
    @Column(name="visits", nullable=false)
    public int getVisits() {
        return this.visits;
    }
    
    public void setVisits(int visits) {
        this.visits = visits;
    }

    
    @Column(name="rate", nullable=false, precision=22, scale=0)
    public double getRate() {
        return this.rate;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }

    
    @Column(name="quantity", nullable=false)
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    @Column(name="pagesNumber", nullable=false)
    public int getPagesNumber() {
        return this.pagesNumber;
    }
    
    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    
    @Column(name="soldAmount", nullable=false)
    public int getSoldAmount() {
        return this.soldAmount;
    }
    
    public void setSoldAmount(int soldAmount) {
        this.soldAmount = soldAmount;
    }

    
    @Column(name="available", nullable=false, columnDefinition = "TINYINT")
    public boolean getAvailable() {
        return this.available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }

    
    @Column(name="keyWords", nullable=false, length=500)
    public String getKeys() {
        return this.keys;
    }
    
    public void setKeys(String keys) {
        this.keys = keys;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="book")
    public Set<UserVisitBook> getUserVisitBooks() {
        return this.userVisitBooks;
    }
    
    public void setUserVisitBooks(Set<UserVisitBook> userVisitBooks) {
        this.userVisitBooks = userVisitBooks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="book")
    public Set<BookOrder> getBookOrders() {
        return this.bookOrders;
    }
    
    public void setBookOrders(Set<BookOrder> bookOrders) {
        this.bookOrders = bookOrders;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="wish_list", catalog="bookstoredb", joinColumns = { 
        @JoinColumn(name="bookID", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="userID", nullable=false, updatable=false) })
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="book")
    public Set<UserCartBook> getUserCartBooks() {
        return this.userCartBooks;
    }
    
    public void setUserCartBooks(Set<UserCartBook> userCartBooks) {
        this.userCartBooks = userCartBooks;
    }

    @Column(name="reviews", nullable=true)
    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
    @Column(name="imgsCount", nullable=true)
    public int getImgsCount() {
        return imgsCount;
    }

    public void setImgsCount(int imgsCount) {
        this.imgsCount = imgsCount;
    }
   
}