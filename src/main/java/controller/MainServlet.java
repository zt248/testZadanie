package controller;

import dao.DBConnection;
import model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    public DBConnection dbConnection = new DBConnection();


    private void doLogic(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        String lineInFormula = req.getParameter("lineInFormula");
        String radix = req.getParameter("radix");
        Calculator calc = new Calculator();
        int radixInt = Integer.parseInt(radix);
        int raschet = 0;
        try {
            raschet = calc.raschet(lineInFormula, radixInt);
        } catch (NumberFormatException e) {
            resp.setStatus(500);
            out.println("Неверный формат.");
            return;
        }

        dbConnection.insertIntoTable(lineInFormula, raschet);

//        System.out.println("Десятичный Ответ = " + raschet);
//        System.out.println("Двоичный Ответ = " + Integer.toBinaryString(raschet));
//        System.out.println("Шестнадцатиричная Ответ = " + Integer.toHexString(raschet));


        out.println(raschet);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doLogic(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doLogic(req, resp);
    }
}

