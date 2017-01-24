import dao.DBConnection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String vvodnay_stroka = null;

        DBConnection db = new DBConnection();

/*Создание БД*/
        db.createTable();

/*Ввод с клавиатуры*/


        model.Calculator calc = new model.Calculator();


//        System.out.println("Введите уравнение в десятичной системе счисления:");
//        Scanner in10 = new Scanner(System.in);
//        vvodnay_stroka = in10.nextLine();
//        db.insertIntoTable(vvodnay_stroka, calc.raschet(vvodnay_stroka));
//        System.out.println("Ответ в десятичной системе счисления = " + calc.raschet(vvodnay_stroka));


//        System.out.println("Введите уравнение в двоичной системе счисления:");
//        Scanner in2 = new Scanner(System.in);
//        vvodnay_stroka = in2.nextLine();
//        int otvet = calc.raschet(vvodnay_stroka, 2);
//        System.out.println("Ответ в двоичной системе счисления = " + Integer.toBinaryString(otvet));

//        System.out.println("Введите уравнение в двоичной системе счисления:");
//        Scanner in16 = new Scanner(System.in);
//        vvodnay_stroka = in16.nextLine();
//        int otvet = calc.raschet(vvodnay_stroka, 16);
//        System.out.println("Ответ в шестнадцатиричной системе счисления = " + Integer.toHexString(otvet));


/*Выведение всех*/
//        db.printAll();

/*Удаление БД из RAM*/
        db.dropConnection();

    }
}
