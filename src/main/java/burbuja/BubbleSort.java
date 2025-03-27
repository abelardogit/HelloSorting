package burbuja;

import common.Shared;

public class BubbleSort {
    public static void order(Integer[] numbers) {
        int numberOfNumbers = numbers.length;
        for (int i = 0; i < numberOfNumbers; i++) {
            for (int j = 0; j < numberOfNumbers - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    Shared.swap(numbers, j, j+1);
                }
            }
        }
    }
}
