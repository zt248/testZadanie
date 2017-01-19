import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static DBConnection dbConnection = null;

    public static void main(String[] args) {

        dbConnection = new DBConnection();
/*Создание БД*/
        dbConnection.createTable();

//        dbConnection.insertIntoTable("1+2", 3);

/*Ввод с клавиатуры*/
        Calculator calc = new Calculator();
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        Integer n = calc.raschet(st);
        dbConnection.insertIntoTable(st,n);

//        dbConnection.insertIntoTable(in.nextLine(),calc.raschet(st));

/*Выведение всех*/
        dbConnection.printAll();


    }
}
