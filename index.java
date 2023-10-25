import java.util.Scanner;

class index {
    public static void main(String[] args) {
        System.out.println("Выведу алфавит в консоль. На каком языке вывести алфавит? \n 1) На русском \n 2) На английском");

        Scanner in = new Scanner(System.in); 
        int lang = in.nextInt(); //ввод числа
        char ch = lang == 1 ? 'а' : 'a'; //определение первого и последнего символа 
        char lastChar = lang == 1 ? 'я' : 'z';

        int i = 0; // счетчик для вывода алфавита в виде таблицы
        // вывод алфавита
        while (ch <= lastChar) {

            if (i % 6 == 0) {
                System.out.println();
            }
            System.out.print(ch);
            ch++;
            i++;
        }
    }
}
