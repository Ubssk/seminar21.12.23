
//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        А теперь реализуйте следующую логику:
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

import java.util.List;

public class Task3 {
//    public void checkArray(Integer[] arr){
//        StringBuilder stringBuilder=new StringBuilder();
//        boolean flag = false;
//        stringBuilder.append("Индексы элементов null: ");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] ==null){
//                if (flag) stringBuilder.append(", ");
//                flag = true;
//                stringBuilder.append(i);
//            }
//        }
//        if (flag) throw new RuntimeException(stringBuilder.toString());
//
//    }

    public static void main(String[] args){
        Integer[] array = {null, 2, null,null};
        checkNull(array);
    }

    public static void checkNull(Integer[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                stringBuilder.append(i).append(" ");

        }
        if (!stringBuilder.isEmpty())
            throw new RuntimeException(String.valueOf(stringBuilder));
    }
}
