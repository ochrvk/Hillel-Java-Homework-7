/*  Создать 2-мерный массив (матрица) M*N и заполнить его случайными числами.
    Отсортировать числа по возрастанию,
    чтобы с левом верхнем углу было самое маленькое число,
    справа от него следующее по значению, итд,
    в правом нижнем углу самое большое. */

package chrvk.javaelementary.hw7.task1;

public class Main {
    public static void outputArray(int[][] array, int N, int M) {
        System.out.println("Массив: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillArray(int[][] array, int N, int M) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = (int) (Math.random() * 90);
            }
        }
    }

    public static void sortArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int lastColumn = j + 1;
                for (int lastRow = i; lastRow < array.length; lastRow++) {
                    while (lastColumn < array[lastRow].length) {
                        if (array[lastRow][lastColumn] < array[i][j]) {
                            int tmp = array[i][j];
                            array[i][j] = array[lastRow][lastColumn];
                            array[lastRow][lastColumn] = tmp;
                        }
                        ++lastColumn;
                    }
                    lastColumn = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 3, M = 4;
        int[][] array = new int[M][N];
        fillArray(array, N, M);
        outputArray(array, N, M);
        sortArray(array);
        outputArray(array, N, M);
    }
}
