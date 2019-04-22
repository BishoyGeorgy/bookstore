/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webproject.bookstore.controller.services;

/**
 *
 * @author Ibrahim
 */
public class ServicesFactory {
    
    public static BookPageServices getBookpageServices(){
        return new BookPageServices();
    }
    
    public static HomeServices getHomeServices(){
        return new HomeServices();
    }
    
    public static OrderServices getOrderServices(){
        return new OrderServices();
    }
    
    public static ProfileServices getProfileServices(){
        return new ProfileServices();
    }
    
    public static Shop getShopServices(){
        return new Shop();
    }
    
    public static UserCartServices getUserCartServices(){
        return new UserCartServices();
    }
    
    public static WishListServices getWishListServices(){
        return new WishListServices();
    }
    
    public static AdminServices getAdminServices(){
        return new AdminServices();
    }
    
    public static Authentication getAuthenticationServices(){
        return new Authentication();
    }
    
    public static StatisticsServices getStatisticsServices(){
        return new StatisticsServices();
    }
}
