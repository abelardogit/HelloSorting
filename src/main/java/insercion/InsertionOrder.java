package insercion;

public class InsertionOrder {

    public static void order(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            Integer aux = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > aux) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = aux;
        }
    }
}

