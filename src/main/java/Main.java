import dao.DBConnection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DBConnection db = new DBConnection();

/*Создание БД*/
        db.createTable();

/*Ввод с клавиатуры*/
        model.Calculator calc = new model.Calculator();
        Scanner in = new Scanner(System.in);
        String vvodnay_stroka = in.nextLine();
        db.insertIntoTable(vvodnay_stroka, calc.raschet(vvodnay_stroka));

/*Выведение всех*/
        db.printAll();

/*Удаление БД из RAM*/
//        db.dropConnection();

    }
}
