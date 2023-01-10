import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();
        System.out.println();
        task10();
    }

    public static void task1(){
        System.out.println("Task1");
        for (int i=1;i<11;i++){
            System.out.println("Значение переменной равно "+i);
        }
    }

    public static void task2(){
        System.out.println("Task2");
        for (int i=10;i>0;i--){
            System.out.println("Значение переменной равно "+i);
        }
    }

    public static void task3(){
        System.out.println("Task3");
        for (int i=0; i<17;i=i+2){
            System.out.println("Значение переменной равно "+i);
        }
    }

    public static void task4(){
        System.out.println("Task4");
        for (int i = 10; i>-11; i--){
            System.out.println("Значение переменной равно "+i);
        }
    }

    public static void task5(){
        System.out.println("Task5");
        for(int i = 1904; i<=2096; i++){
            if(i%4==0 && i%100!=0 || i%400==0){
                System.out.println(i + " год является високосным");
            }
        }
    }

    public static void task6(){
        System.out.println("Task6");
        for (int i = 7; i<99;i=i+7){
            System.out.print(i + " ");
        }
    }

    public static void task7(){
        System.out.println("Task7");
        for(int i=1;i<513;i=i+i){
            System.out.print(i+" ");
        }
    }

    public static void task8(){
        System.out.println("Task8");
        double savings = 29000.0;
        double total=0;
        for (int i=1; i<13;i++){
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
    }

    public static void task9(){
        System.out.println("Task9");
        double savings = 29000.0;
        double total=0;
        double rate=0.01;

        for(int i=0;i<12;i++){
            total = total+ savings;
            total=total*(1+rate);
            System.out.printf(Locale.US,"Месяц %d, сумма накоплений равна %.2f %n",i+1,total);
        }
    }

    public static void task10(){
        System.out.println("Task10");
        for(int i=1;i<11;i++){
            System.out.println("2 * "+i+" = "+ i*2);
        }
    }
}