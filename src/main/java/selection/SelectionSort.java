package selection;

import common.Shared;

// {15, 60, 8, 16, 44, 27, 12, 35};
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
