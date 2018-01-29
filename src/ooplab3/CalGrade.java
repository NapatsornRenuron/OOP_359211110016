package ooplab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalGrade {
    //    score 0-49 grade F
//    score 50-59 grade D
//    score 60-69 grade C
//    score 70-79 grade B
//    score 80-100 grade A

    public static void main(String[] args) throws IOException {
//        BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int score = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Your Score : ");
            score = Integer.parseInt(reader.readLine());
            if (score < 0 || score > 100) {
                count++;
                if (count == 3) {
                    System.out.println("User Error");
                    break;
                }
            } else {
                if (score < 50) System.out.println("Your Grade : F");
                else if (score <= 59) System.out.println("Your Grade : D");
                else if (score <= 69) System.out.println("Your Grade : C");
                else if (score <= 79) System.out.println("Your Grade : B");
                else System.out.println("Your Grade : A");
            }
        }
    }
}

