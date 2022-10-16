/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class Main

{
    private static Scanner read;
    public static void main(String[] args) {
        Scanner scunner = new Scanner(System.in);
        System.out.println("1.  Напишите программу, чтобы найти значение указанного выражения. \n" +
                "2.  Напишите программу, которая принимает четыре целых числа от пользователя и выводит надпись равно, если все четыре равны, и не равно в противном случае. \n" +
                "3.  Напишите программу для поиска k самых больших элементов в заданном массиве. Элементы в массиве могут располагаться в любом порядке.\n" +
                "4.  Напишите программу для поиска k наименьших элементов в заданном массиве. Элементы в массиве могут располагаться в любом порядке.\n" +
                "5.  Напишите программу для поиска чисел, превышающих среднее значение чисел данного массива. \n" +
                "6.  Напишите программу для умножения двух заданных целых чисел без использования оператора умножения(*).\n" +
                "7.  Напишите для разбиения заданного массива целых чисел на четное число первым и нечетное число вторым.\n" +
                "8.  Напишите для преобразования температуры из градуса Фаренгейта в градус Цельсия. \n" +
                "9.  Напишите программу для вычисления индекса массы тела (ИМТ). ИМТ = ВЕС / РОСТ2\n" +
                "10.  Напишите, которая считывает число и отображает квадрат, куб и четвертую степень. \n" +
                "11.  Напишите программу, чтобы проверить, могут ли три заданные длины сторон (целые числа) образовать треугольник или нет.");
        int choose = scunner.nextInt();
        if (choose==1){
            first();
        }else if (choose==2){
            second();
        }else if(choose==3){
            third();
        }else if(choose == 4){
            fourth();
        }
        else if(choose==5){
            finth();
        }
        else if(choose==6){
            sixth();
        }else if(choose==7) {
            seventh();
        }else if(choose==8){
            eighth();
        }else if(choose==9){
            nineth();
        }else if (choose==10){
            tenth();
        }else if (choose==11){
            eleventh();
        }
    }

    static void first(){
        int Acase=(101+0)/3;
        System.out.println(Acase);
        double Bcase = 3.0e-6 * 10000000.1;
        System.out.println(Bcase);
        boolean Ccase = true&&true;
        System.out.println(Ccase);
        boolean Dcase = false &&true;
        System.out.println(Dcase);
        boolean Ecase = (false&&false)^(true&&true);
        System.out.println(Ecase);
        boolean Fcase = (false^false)&&(true&&true);
        System.out.println(Fcase);
    }
    static void second(){
        System.out.println("Введите 4 числа");
        Scanner scunner1 = new Scanner(System.in);
        int firNum = scunner1.nextInt();
        int secNum = scunner1.nextInt();
        if(secNum==firNum){
            int thrNum = scunner1.nextInt();
            if (thrNum==secNum){
                int fotNum = scunner1.nextInt();
                if(fotNum==thrNum){
                    System.out.println("Равно");
                    System.exit(0);
                }
            }
        }
        System.out.println("Неравно");


    }
    static void third(){
        System.out.println("Введите число");
        Scanner scunner1 = new Scanner(System.in);
        int num = scunner1.nextInt();
        int[] k = {1232, 18, 16, 99, 1};
            Arrays.sort(k);
        for (int i = 0; i < k.length / 2; i++) {
            int mass = k[i];
            k[i] = k[k.length - i - 1];
            k[k.length - i - 1] = mass;
        }
            for (int i=0; i <num;i++){
                System.out.println(k[i]);
            }
        /*
        for(int s=0;s<k.length;s++){
            for (int i = 0; i < k.length; i++)
            {
                if(max<k[i]){
                    max = k[i];
                    k[i]=-2147483648;
                }
            }
            System.out.println(max);
        }*/
    }
    static void fourth(){
        System.out.println("Введите число");
        int[] k = {2, 18, 16, 99, 1};
        Scanner scunner1 = new Scanner(System.in);
        int num = scunner1.nextInt();
        Arrays.sort(k);
        for (int i=0; i <num;i++){
            System.out.println(k[i]);
        }
    }
    static void finth(){
        int[] num = {2,6,1,78,123};
        int num2 = 0;
        for (int i = 0; i<num.length;i++){
            num2 = num2 + num[i];

        }
        num2 = num2 / num.length;
        for(int i=0;i<num.length;i++){
            if(num2<num[i]){
                System.out.println(num[i]);
            }
        }
    }
    static void sixth(){
        System.out.println("Введите два числа для умножения");
        Scanner scunner1 = new Scanner(System.in);
        int firNum = scunner1.nextInt();
        int secNum = scunner1.nextInt();
        int thirNum = firNum;
        int znak=1;
        if(secNum<0){
            secNum=secNum*(-1);
            znak=znak*-1;
        }
        for (int i = 1;i<secNum;i++){
            thirNum= thirNum+firNum;
        }
        if(secNum==0){
            System.out.println("0");
            System.exit(0);
        }
        System.out.println(thirNum*znak);
    }
    static void seventh(){
        int[] k = {2, 18, 16, 99, 1};
        int chet = 0;
        int nechet=0;
        int[] chetch = new int[k.length];
        int[] nechetch = new int[k.length];
        for(int i = 0;i<k.length;i++){
        int n = k[i];
        if(n % 2 == 0) {
            chetch[chet] = n;
            chet++;
//            System.out.println("Число " + n + " четное");
        } else {
            nechetch[nechet]=n;
            nechet++;
//            System.out.println("Число " + n + " нечетное");
        }
        }
        System.out.println("Четные"+Arrays.toString(chetch));
        System.out.println("Нечетные" +Arrays.toString(nechetch));
    }
    static void eighth(){
        System.out.println("Введите градусы фаренгейта");
        Scanner scunner1 = new Scanner(System.in);
        float far=scunner1.nextFloat();
        float cel=((far-32)*5)/9;
//        float coof=5/9;
//        cel=(far-32)*coof;
        System.out.println("Цельсия = "+cel);
    }
    static void nineth(){
        Scanner scunner1=new Scanner(System.in);
        System.out.println("Рост в метрах");
        Double length=scunner1.nextDouble();
        length=length*length;
        System.out.println("Вес в кг");
        Double weight=scunner1.nextDouble();
        double index=weight/length;
        System.out.println(index);
        if(index<18.5){
            System.out.println("Недостаточная масса тела");
        }else if(index>30){
            System.out.println("Избыток массы веса");
        }else{
            System.out.println("Норма");
        }
    }
    static void tenth(){
        Scanner scunner1=new Scanner(System.in);
        int ch=scunner1.nextInt();
        System.out.println("Квадрат = "+ ch*ch+" Куб = " + ch*ch*ch+" Четрветая степень = "+ch*ch*ch*ch);
    }
    static void eleventh(){
        Scanner scunner1= new Scanner(System.in);
        System.out.println("Введите три стороны");
        int a = scunner1.nextInt();
        int b = scunner1.nextInt();
        int c = scunner1.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Треугольник существует");
        }else{
            System.out.println("Треугольник не существет");
        }

    }


}
