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
public class ArithmeticCalculatorServlet extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       request.setAttribute("result","---");
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");
        String operation = request.getParameter("operation");
        
        
        request.setAttribute("firstNum", firstNum);
        request.setAttribute("secondNum", secondNum);
       
        try{
            int first = Integer.parseInt(firstNum);
            int second = Integer.parseInt(secondNum);
            int answer = 0;
            
            switch(operation){
                case "+" :
                    answer = first + second;
                    break;
                case "-" :
                    answer = first - second;
                    break;
                case "*" :
                    answer = first * second;
                    break;
                case "%" :
                    answer = first % second;
                    break;
                }
            request.setAttribute("result", answer);
        }
        catch (NumberFormatException e) {
            request.setAttribute("result", "invalid");
        }
        catch (ArithmeticException e) {
            request.setAttribute("result", "Cannot divide by 0");
        }
            
        
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

   

}
