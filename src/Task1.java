//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//        Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        если вместо массива пришел null, метод вернет -3
//        придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод
//        запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение и
//        покажет читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение:
//        “Искомый элемент не найден”.
public class Task1 {
//    public static int checkLength(int[] array, int find, int min){
//        if (array==null)
//            return  -3;
//        if (array.length<min)
//            return -1;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]==find)
//                return i;
//        }
//        return -2;
//    }
//    public String output(int[] array, int find, int min){
//        String message;
//        int res = checkLength(array, find, min);
//        switch (res){
//            case -1:
//                message = "длина массива меньше некоторого заданного минимума";
//                System.out.println(message);
//                break;
//            case -2:
//                message = "искомый элемент не найден";
//                break;
//            case -3:
//                message = "вместо массива пришел null";
//                break;
//            default:
//                message = String.valueOf(res);
//        }
//        return message;
//    }


//    public class  Task1 {
//        private static int FindIndex(int[] array, int minLength, int findValue){
//            int result = -2;
//
//            if(array == null)
//                return -3;
//
//            if(array.length < minLength)
//                return -1;
//
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == findValue){
//                    result = i;
//                    break;
//                }
//            }
//            return result;
//        }
//
//        public static void FindArrayIndex(int[] array){
//            Scanner scanner = new Scanner("Введите искомое число");
//            int findValue = scanner.nextInt();
//            scanner = new Scanner("Введите минимальный размер массива");
//            int minLength = scanner.nextInt();
//            int result = FindIndex(array,minLength,findValue);
//            if (result == -3){
//                System.out.println("Пустая ссылка на массив");
//            }
//            if (result == -2){
//                System.out.println("Искомый элемент не найден");
//            }
//            if (result == -1){
//                System.out.println("Длина массива меньше минимальной");
//            }
//            System.out.println("Индакс искомого элемента"+" = "+ result);
//        }
//    }


    public static void main(String[]args){
        int[] test = new int[]{1,2,3,4,5,6};
        findIndexElementMessage(test, 3, 7);
        findIndexElementMessage(test, 7, 3);
        findIndexElementMessage(null, 7, 3);
        findIndexElementMessage(test, 4, 3);
    }
    public static int findIndexElement(int[] array, int value, int minLen){
        if (null==array)
            return -3;
        if (array.length<minLen)
            return -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value)
                return i;
        }
        return -2;
    }

    public static void findIndexElementMessage(int[] array, int value, int minLen) {
        int result = findIndexElement(array, value, minLen);
        if (result == -1) {
            System.out.println("длина массива меньше некоторого заданного минимума");
            return;
        }
        if (result == -2) {
            System.out.println("искомый элемент не найден");
            return;
        }

        if (result == -3) {
            System.out.println("вместо массива пришел null");
            return;
        }
        if (result>=0)
            System.out.println("индекс искомого элемента: " + result);
    }
}
