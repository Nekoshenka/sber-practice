package sber.oop;

import java.util.Scanner;

import sber.oop.phone.Phone;
import sber.oop.circle.Circle;
import sber.oop.circle.Color;
import sber.oop.matrix.Matrix;
import sber.oop.book.Book;
import sber.oop.book.Author;
import sber.oop.pizza.PizzaOrder;
import sber.oop.pizza.Size;
import sber.oop.paint.*;

public class Main {

    public static void main(String[] args) {
        taskPhone();
        taskCircle();
        taskMatrix();
        taskBook();
        taskPizza();
        taskPaint();
    }

    private static void taskPhone() {
        System.out.println("\nЗадача 1:");
        Phone nokia = new Phone();
        Phone samsung = new Phone("89129877294", "20pro");
        Phone asus = new Phone("89537651287", "5s", 225);
        System.out.println(nokia.toString());
        System.out.println(asus.toString());
        samsung.receiveCall("Антон");
        asus.receiveCall("Валера", "89619871265");
        asus.sendMessage();
    }

    private static void taskCircle() {
        System.out.println("\nЗадача 2:");
        Circle circle = new Circle(10, Color.Red);
        System.out.println(circle.toString());
    }

    private static void taskMatrix() {
        System.out.println("\nЗадача 3:");
        Scanner scan = new Scanner(System.in);
        int lines = 3, columns = 3;

        Matrix matrix1 = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                System.out.print("Введите [" + (line + 1) + ", " + (column + 1) + "] элемент матрицы: ");
                matrix1.setValue(line, column, scan.nextFloat());
            }
        }
        matrix1.getMatrix();

        Matrix matrix2 = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                System.out.print("Введите [" + (line + 1) + ", " + (column + 1) + "] элемент матрицы: ");
                matrix2.setValue(line, column, scan.nextFloat());
            }
        }
        matrix2.getMatrix();

        matrix1.matrixScalar(3).getMatrix();
        matrix1.matrixMultiply(matrix2).getMatrix();
        matrix1.matrixAdd(matrix2).getMatrix();
    }

    private static void taskBook() {
        System.out.println("\nЗадача 4:");
        Author author = new Author("Л. Н. Толстой", "Мужчина", "lntolstpy@mail.ru");
        Book book = new Book("Война и мир", author, 1873);
        System.out.println(author.toString());
        System.out.println(book.toString());

        author.setName("А. А. Ахматова");
        author.setSex("Женщина");
        author.setEmail("aaahmatova@mail.ru");
        book.setYear(2013);
        book.setTitle("Реквием");
        System.out.println(author.toString());
        System.out.println(book.toString());
    }

    private static void taskPizza() {
        System.out.println("\nЗадача 5:");
        PizzaOrder first = new PizzaOrder("Пепперони", Size.MEDIUM, false, "Северная 7");
        first.order();
        first.order();
        first.cancel();
        first.cancel();
        System.out.println(first.toString());
    }

    private static void taskPaint() {
        System.out.println("\nЗадача 6:");
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(1, 1));
        Square square = new Square(new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(0, 1));
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(3, 0), new Point(0, 1), new Point(0, 1));
        sber.oop.paint.Circle circle = new sber.oop.paint.Circle(new Point(1, 0), new Point(-1, 0), new Point(0, 1));

        FigureUtil.area(triangle);
        FigureUtil.perimeter(square);
        FigureUtil.draw(rectangle);
        FigureUtil.draw(circle, sber.oop.paint.Color.Green);
    }

}