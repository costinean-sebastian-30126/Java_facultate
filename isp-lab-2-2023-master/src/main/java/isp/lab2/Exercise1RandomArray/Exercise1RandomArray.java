package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++)
            array[i] = random.nextInt();
        //TODO: implement the logic to fill the array with random numbers
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int[] MaxMin = {array[0], array[0]};
        for (int j : array) {
            if (j < MaxMin[0]) MaxMin[0] = j;
            if (j > MaxMin[1]) MaxMin[1] = j;
        }
        return MaxMin;
    }

    public static void main(String[] args) {

        Random random = new Random();

        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
