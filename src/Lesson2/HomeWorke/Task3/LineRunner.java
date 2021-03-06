package Lesson2.HomeWorke.Task3;

/*
Написать класс:
Клиентский класс LineRunner: протестировать функционал предыдущих классов.
 */

public class LineRunner {

    public static void main(String[] args) {
        Lines lines = new Lines();
        Line line1 = new Line(new Point(0, 0), new Point(5, 5));
        Line line2 = new Line(new Point(-6, 2), new Point(2, 8));
        Line line3 = new Line(new Point(1, 2), new Point(6, 4));
        lines.addLine(line1);
        lines.addLine(line2);
        lines.addLine(line3);

        System.out.println(line3.calcLen());
        System.out.println("Summary length: " + lines.calcSummaryLen());
        System.out.println("The longest one: \n" + lines.findTheLongest());
    }

}

//5.385164807134504
//Summary length: 22.45623261899998
//The longest one:
//X1: -6,000000, Y1: 2,000000
//X2: 2,000000, Y2: 8,000000
//
//Process finished with exit code 0
