package org.example.week9.d5.e1;

public class ArrayManipulator {
    final void avgElements(int[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println(average);
    }
}
