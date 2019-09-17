package Question_14;

import java.util.Scanner;
import java.util.Random;

public class question_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = 0;
        System.out.print("Enter the size of lines: "); //условие некорректное.
        int lines = scanner.nextInt();                 //К примеру, кол-во строк 4, а столбцов 6, как подставить, например, 5 единиц в столбец, если его высота всего 4?
        System.out.print("Enter the size of columns: "); //Для корректной работы, нужно создать квадратную матрицу!
        int columns = scanner.nextInt();                 // (lines=columns)
        int a[][] = new int[lines][columns];
        for (int i = 0; i<lines; i++) {
            for (int j = 0; j<columns; j++){
                a[i][j] = random.nextInt(2);
            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i<lines; i++) {
            for (int j = 0; j<columns; j++){
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    if (a[j][i]==1) {
                    }
                    if(j==0) {
                        a[j][i]=0;
                    }
                    if(j>0)
                        a[j][i]=1;
                    if(i==j){
                        a[j][i]=0;
                    }
                    if(i>j){
                        a[j][i]=0;
                    }
                }
            }
        System.out.println("Modified matrix: ");
        for (int i = 0; i<lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }
    }
}


