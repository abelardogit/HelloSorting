import burbuja.BubbleSort;
import selection.SelectionSort;

import insercion.InsertionOrder;

public class HelloSortingApp {

    public static void main(String[] args) {
//        int[] swapNumbers = {1, 3};
//        Shared.swap(swapNumbers, 0, 1);
//        System.out.println(Arrays.toString(swapNumbers));

        long start = System.nanoTime();
        burbuja();
        long estimatedTime = System.nanoTime() - start;
        System.out.println("Burbuja:" + estimatedTime);
//
        start = System.nanoTime();
        seleccion();
        estimatedTime = System.nanoTime() - start;
        System.out.println("Selección:" + estimatedTime);


        start = System.nanoTime();
        insercion();
        estimatedTime = System.nanoTime() - start;
        System.out.println("Inserción:" + estimatedTime);
    }

    private static void burbuja() {
        Integer[] numbers = {15, 60, 8, 16, 44, 27, 12, 35};

        BubbleSort.order(numbers);

        for (Integer aNumber: numbers) {
            System.out.println(aNumber);
        }

    }

    private static void seleccion() {
        Integer[] numbers = {15, 60, 8, 16, 44, 27, 12, 35};

        SelectionSort.order(numbers);

        for (Integer aNumber: numbers) {
            System.out.println(aNumber);
        }

    }

    private static void insercion() {
        Integer[] numbers = {15, 60, 8, 16, 44, 27, 12, 35};

        InsertionOrder.order(numbers);

        for (Integer aNumber: numbers) {
            System.out.println(aNumber);
        }

    }
}
