/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.endpoints;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.model.DatabaseConnectionDetail;
import za.system.SmartServlet;

/**
 *
 * @author just1689
 */
@WebServlet(urlPatterns = {"/NewConnection"})
public class NewConnection extends SmartServlet<DatabaseConnectionDetail> {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        DatabaseConnectionDetail post = convertPostToObject(request, DatabaseConnectionDetail.class);
        try (PrintWriter writer = response.getWriter()) {
            writer.println(post);
        }
        
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter writer = response.getWriter()) {
            writer.println("Hi from NewConnection servlet");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
