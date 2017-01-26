import dao.DBConnection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String lineInFormula = null;


        
        DBConnection db = new DBConnection();

/*Создание БД*/
        db.createTable();

/*Ввод с клавиатуры*/


        model.Calculator calc = new model.Calculator();


//        System.out.println("Введите уравнение в десятичной системе счисления:");
//        Scanner in10 = new Scanner(System.in);
//        lineInFormula = in10.nextLine();
//        db.insertIntoTable(lineInFormula, calc.raschet(lineInFormula));
//        System.out.println("Ответ в десятичной системе счисления = " + calc.raschet(lineInFormula));


//        System.out.println("Введите уравнение в двоичной системе счисления:");
//        Scanner in2 = new Scanner(System.in);
//        lineInFormula = in2.nextLine();
//        int otvet = calc.raschet(lineInFormula, 2);
//        System.out.println("Ответ в двоичной системе счисления = " + Integer.toBinaryString(otvet));

//        System.out.println("Введите уравнение в двоичной системе счисления:");
//        Scanner in16 = new Scanner(System.in);
//        lineInFormula = in16.nextLine();
//        int otvet = calc.raschet(lineInFormula, 16);
//        System.out.println("Ответ в шестнадцатиричной системе счисления = " + Integer.toHexString(otvet));


/*Выведение всех*/
//        db.printAll();

/*Удаление БД из RAM*/
        db.dropConnection();

    }
}
