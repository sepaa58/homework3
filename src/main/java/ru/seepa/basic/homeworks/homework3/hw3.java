package ru.seepa.basic.homeworks.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class hw3 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                int a = rand.nextInt(5 - 2 + 1) + 2;
                int b = rand.nextInt(5 - 1 + 1) + 1;
                int[][] arrToSumm = genArr(a, b);
                System.out.println("Итоговая сумма - " + sumOfPositiveElements(arrToSumm));
                break;
            case 2:
                int size = scanner.nextInt();
                printCube(size);
                break;
            case 3:
                int cubeSize = rand.nextInt(5 - 2 + 1) + 2;
                System.out.println(cubeSize);
                int[][] zeroingSquare = genArr(cubeSize, cubeSize);
                zeroing(zeroingSquare);
                break;
            case 4:
                int sizea = rand.nextInt(5 - 2 + 1) + 2;
                int sizeb = rand.nextInt(5 - 2 + 1) + 2;
                int[][] arrToFindMax = genArr(sizea, sizeb);
                System.out.println(findMax(arrToFindMax));
                break;
            case 5:
                int sizei = rand.nextInt(5);
                int sizej = rand.nextInt(5);
                int[][] sumingArr = genArr(sizei, sizej);
                System.out.println(sumArr(sumingArr));
                break;
            default:
                System.out.println(" 123 ");
        }
    }

    public static int[][] genArr(int sizeA, int sizeB) {
        Random rand = new Random();
        int[][] arr = new int[sizeA][sizeB];
        System.out.println("Ваш массив");
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                arr[i][j] = rand.nextInt(21) - 10;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }

    public static int sumOfPositiveElements(int[][] arrToSumm) {
        int sumOfArr = 0;

        for (int i = 0; i < arrToSumm.length; i++) {
            for (int j = 0; j < arrToSumm[i].length; j++) {
                if (arrToSumm[i][j] > 0) {
                    sumOfArr += arrToSumm[i][j];
                }
            }
        }
        return sumOfArr;
    }

    public static void printCube(int size) {
        int[][] cube = new int[size][size];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void zeroing(int[][] zeroingSquare) {
        System.out.println("Результат работы - ");
        for (int i = 0; i < zeroingSquare.length; i++) {
            zeroingSquare[i][i] = 0;
            System.out.println(Arrays.toString(zeroingSquare[i]));
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumArr(int[][] sumingArr) {
        int sum = 0;
        if (sumingArr.length > 1) {
            for (int i = 0; i < sumingArr[1].length; i++) {
                sum += sumingArr[1][i];
            }
            return sum;
        } else {
            return -1;
        }
    }
}