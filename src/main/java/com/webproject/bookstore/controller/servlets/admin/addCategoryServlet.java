package com.webproject.bookstore.controller.servlets.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webproject.bookstore.controller.services.AdminServices;
import com.webproject.bookstore.controller.services.HomeServices;
import com.webproject.bookstore.controller.services.ServicesFactory;
import com.webproject.bookstore.model.dal.hibrnate.entities.Category;
import java.util.List;

@WebServlet("/addCategoryServlet")
public class addCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public addCategoryServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Category category=new Category();
		AdminServices adminServices=new AdminServices();
		
		String categoryName=request.getParameter("categ");
		          System.out.println("//////////////////////"+categoryName);
		category.setCategoryId(0);
		category.setCategoryName(categoryName);
		adminServices.addCategory(category);
                HomeServices homeServices = ServicesFactory.getHomeServices();
                List<Category> allCategories = homeServices.getAllCategories();
                 request.getServletContext().setAttribute("categories", allCategories);
                 request.getRequestDispatcher("admin/AddCateg.jsp").forward(request, response);
                
	}

}
