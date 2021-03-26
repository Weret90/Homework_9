import java.util.Arrays;

public class Homework9 {

    public static int sumArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int[][] array2 = new int[array.length][array.length];
        if(array.length != 4) {
            throw new MyArraySizeException();  //если двумерный массив не состоит из четырех одномерных массивов то бросается MyArraySizeException
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].length != 4) {
                throw new MyArraySizeException(); //если одномерные массивы из которых состоит двумерный массив не состоят из четырех элементов то бросается опять же MyArraySizeException
            }
            for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]); //здесь может произойти исключение NumberFormatException - невозможность преобразования String в int
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j); //если нельзя преобразовать то бросается MyArrayDataException, в который передаем координаты ячейки с ошибкой
                    }
            }
        }
        return sum;
    }

    public static void sumArrayWithExceptions (String[][] array){
        try {
            int a = sumArray(array);
            System.out.println(a);
        } catch (MyArraySizeException e) { //если поймали наши созданные исключения то выводятся сообщения:
            System.out.println("На входе имеем массив другого размера, не 4х4");
        } catch (MyArrayDataException e) {
            System.out.printf("Преобразование строк в двумерном массиве в int не удалось. В ячейке [%d, %d] есть символ или текст вместо числа\n", e.getI(), e.getJ());
        }
    }

}
