/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webproject.bookstore.controller.services;

import com.webproject.bookstore.model.dal.hibrnate.daoImp.BookDao;
import com.webproject.bookstore.model.dal.hibrnate.daoImp.SuperDao;
import com.webproject.bookstore.model.dal.hibrnate.util.DaoFactory;

/**
 *
 * @author Ibrahim
 */
public class StatisticsServices {
    SuperDao daoObject;
    BookDao bookDao;
    public StatisticsServices() {
    }
    
    public long getUsersCount() throws ClassNotFoundException{
        long count;
        daoObject =DaoFactory.getUserDao();
        count = daoObject.getEntityCount();
        return count;
    }
    
    public long getBookssCount() throws ClassNotFoundException{
        long count;
        daoObject =DaoFactory.getBookDao();
        count = daoObject.getEntityCount();
        return count;
    }
    
    public long getOrdersCount() throws ClassNotFoundException{
        long count;
        daoObject =DaoFactory.getOrderDao();
        count = daoObject.getEntityCount();
        return count;
    }
    
    public long getBooksVisitsCount() throws ClassNotFoundException{
        long count;
        daoObject =DaoFactory.getUserVisitBookDao();
        count = daoObject.getEntityCount();
        return count;
    }
    
    public long getCategoriesCount() throws ClassNotFoundException{
        long count;
        daoObject =DaoFactory.getCategoryDao();
        count = daoObject.getEntityCount();
        return count;
    }
    
    public long getSalesCount(){
        long count;
        bookDao =DaoFactory.getBookDao();
        count = bookDao.getSalesCount();
        return count;
    }
    
    public long getAvailableBooksCount(){
        long count;
        bookDao =DaoFactory.getBookDao();
        count = bookDao.getAvailableCounts();
        return count;
    }
    
    public long getAuthorsCount(){
        long count;
        bookDao =DaoFactory.getBookDao();
        count = bookDao.getAuthorsCounts();
        return count;
    }
    
}
