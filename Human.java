import java.util.Scanner;
public class Human  {
    String famil = "фамилия";
    String name = "Имя";
    String otchestvo = "Отчёство";
        int age = 1;
    int large = 1;
    public Human(String a, String b, String c, int  d, int e) {
        famil = a;
        name = b;
        otchestvo = c;
        age = d;
        large =e;
    }
    public  Human(){

    }
    public void say (String name){
        System.out.println();
    }

}
