package selection;

import common.Shared;

public class SelectionSort {
    public static void order(Integer[] numbers) {
        int numberOfNumbers = numbers.length;
        for (int i = 0; i < numberOfNumbers; i++) {
            for (int j = i; j < numberOfNumbers; j++) {
                if (numbers[i] > numbers[j]) {
                    Shared.swap(numbers, i, j);
                }
            }
        }
    }
}
