/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main

{
    private static Scanner read;
	public static void main(String[] args) {
    Scanner scunner = new Scanner(System.in);
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
int[] k = {1232, 18, 16, 99, 1};
  int max = 0;
  int[] p;
  for(int s=0;s<k.length;s++){
  for (int i = 0; i < k.length; i++) 
  {
    if(max<k[i]){
        max = k[i];
        k[i]=-2147483648;
    }
  }
    System.out.println(max);
}
}
static void fourth(){
    int[] k = {2, 18, 16, 99, 1};
  int min = k[0];
  for (int i = 1; i < k.length; i++) 
  {
      min = Math.min(min, k[i]);
      
  }
    System.out.println(min);
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
    Scanner scunner1 = new Scanner(System.in);
    int firNum = scunner1.nextInt();
    int secNum = scunner1.nextInt();
    int thirNum = firNum;
    for (int i = 1;i<secNum;i++){
        thirNum= thirNum+firNum;
    }
    System.out.println(thirNum);
}
static void seventh(){
    
}


}
