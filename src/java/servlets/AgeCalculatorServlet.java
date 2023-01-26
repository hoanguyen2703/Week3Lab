package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author khanhhoanguyen
 */
public class AgeCalculatorServlet extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        request.setAttribute("age", age);
        
        if (age == null || age.equals("")) {
                request.setAttribute("message", "You must give your current age");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                return;
            }
        else if(age.contains("-") || age.contains(".")){
            request.setAttribute("message", "You must enter a positive integer number");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
                return;
        }
        else{
            try{
                int intAge = Integer.parseInt(age);
                request.setAttribute("message","Your age next birthday will be " + ++intAge);

            }
            catch(NumberFormatException e){
                request.setAttribute("message", "You must enter a number");
            }
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        
        
    }

    

}
