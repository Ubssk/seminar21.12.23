
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
//        (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class Task2 {
//    public int findSum(int[][] array){
//        int sum=0;
//        if(array[0].length != array.length){
//            throw  new RuntimeException("Двумерный массив не является квадратным. Текущий размер массива: " + array.length + ", " + array[0].length);
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                if (array[i][j] != 1 && array[i][j] != 0)
//                    throw new RuntimeException("Элемент с индексами [" + i + ", " + j + "] содержит значения отличные от 1 или 0");
//                sum+=array[i][j];
//            }
//        }
//        return sum;
//    }

    public static void  main(String[] args){
        int[][] test = new int[][] {{1,0,1},{1,0,1}};
        System.out.println(sumArray2D(test));

    }

    public static int sumArray2D(int[][] array){
        if (array.length != array[0].length)
            throw  new RuntimeException("Массив не квадратный, размер: " + array.length + "x" + array[0].length);
        int sum =0;
        for(int[] i : array){
            for (int j : i){
                if(j!=0 && j!=1)
                    throw new RuntimeException("Значение не 0 и не 1");
                sum +=j;
            }
        }
        return sum;
    }
}
