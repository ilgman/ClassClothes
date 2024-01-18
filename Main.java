import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во людей");
        int people = sc.nextInt();
        sc.nextLine();
        Human number1[] = new Human[people];
        for (int i=0; i<people; i++) {
            System.out.println("Введите Фамилию человека");
            String a= sc.nextLine();
            System.out.println("Введите Имя человека");
            String b= sc.nextLine();
            System.out.println("Введите Отчёство человека");
            String c= sc.nextLine();
            System.out.println("Введите возраст человека");
            int d = sc.nextInt();
            System.out.println("Введите размер человека(1-100)");
            int e = sc.nextInt();
            number1[i] = new Human(a,b,c,d,e);
            sc.nextLine();

        }
        System.out.println("Введите номер человека по которому показать информацию");
        int nom =sc.nextInt();
        System.out.println(VVivod(nom,number1));

        System.out.println("Максимальный размер у человека "+number1[Maxrazme(people, number1)]+" он состовляет "+ number1[Maxrazme(people, number1)].large);

        System.out.println("Средний размер одежды равен у людей 40+ "+Srlarge(people,number1));

        System.out.println(Arrays.toString(Sortir(people,number1)));

    }
    public static String VVivod(int p, Human[] number1) {
        int i = p-1;
        String result = null;
            result = ("Данные " + number1[i] + " человека " + number1[i].famil + " " + number1[i].name + " " + number1[i].otchestvo + " " + number1[i].age + " " + number1[i].large);

        return result;
    }
    public static int Maxrazme(int p, Human[] number1){
        int maxi =0;
        int max = 0;
        int people = p;
        for (int i = 0; i < people; i++) {
            if (number1[i].large > max){
                max = number1[i].large;
                maxi = i;
            }
        }

        return maxi;
    }
    public static double Srlarge(int p, Human[] number1)
    {
     double srrazmer=0;
     int summ =0;
     int kol =0;
        int people = p;
        for (int i = 0; i < people; i++) {
            if (number1[i].age > 40){
                summ = summ+number1[i].large;
                kol++;
            }
        }
        if (kol == 0){
            srrazmer =0;
        } else{
            srrazmer=summ/kol;
        }

        return srrazmer;
    }
    public static int[] Sortir(int p, Human[] number1){
        int people = p;
        int[] arr = new int[p];
        for (int i = 0; i < people; i++) {
            arr[i]=number1[i].large;
        }
        Arrays.sort(arr);
        return arr;
    }




}
