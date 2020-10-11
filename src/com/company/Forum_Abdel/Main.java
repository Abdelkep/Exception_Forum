package com.company.Forum_Abdel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukkan x: ");
            int x = input.nextInt();
            System.out.print("Masukkan y: ");
            int y = input.nextInt();
            int hasil = x/y;
            System.out.print("Hasilnya " + hasil);
        }catch (InputMismatchException e){
            System.out.print("Hasilnya: java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.print("Hasilnya: java.lang.ArithmeticException: / byzero");
        }
    }
}
