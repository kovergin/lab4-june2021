import java.util.Scanner;

public class Main {
    public static int rnd(){
        int range = 50 + Math.abs(-50) + 1;
        return  (int) (Math.random() * range) - 50;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество столбцов в массиве: ");
        int x = sc.nextInt();
        System.out.println("Введите количество строк в массиве: ");
        int y = sc.nextInt();
        System.out.println("Задайте число: ");
        int z = sc.nextInt();
        sc.close();

        System.out.println("...поиск подходящих условиям задачи элементов");

        int[][] arr = new int[x][y];
        int qua = 0;

        for(int i=0; i<x; i++) {
            arr[i][0] = rnd();
            for(int l=0; l<y; l++) {
                arr[i][l] = rnd();
                if (arr[i][l]>=0) {
                    if ((i+l)>z) {
                        qua += 1;
                        if (qua!=0) {
                            System.out.println("столбец: "+(i+1)+" строка: "+(l+1)+" значение: "+arr[i][l]);
                        }
                    }
                }
            }
        }

        if (qua!=0) {
            System.out.println("Общее количество элеметов неотрицательных элементов, сумма индексов которых больше заданного числа: "+qua);
        } else {
            System.out.println("В данном массиве нет ни одного элемента удовлетворяещго условиям задачи!");
        }
    }
}
