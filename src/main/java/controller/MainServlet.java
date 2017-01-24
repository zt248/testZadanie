package controller;

import dao.DBConnection;
import model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    public DBConnection dbConnection = new DBConnection();

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        String vvodnay_stroka = req.getParameter("vvodnay_stroka");
        String radix = req.getParameter("radix");
        Calculator calc = new Calculator();
        int raschet = calc.raschet(vvodnay_stroka, Integer.parseInt(radix));

        dbConnection.insertIntoTable(vvodnay_stroka,raschet);

//        System.out.println("Десятичный Ответ = " + raschet);
//        System.out.println("Двоичный Ответ = " + Integer.toBinaryString(raschet));
//        System.out.println("Шестнадцатиричная Ответ = " + Integer.toHexString(raschet));


        out.println(raschet);

    }
}

