import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    private static int min;

    public static void main(String[] args) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Task_1");

        // Task_1
        /*Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы
        тяжести на Земле.*/
        //G in the moon = 1,6

        System.out.print("Input your weightInEarth: ");
        String weightInEarthtx = reader.readLine();
        int weightInEarth = Integer.parseInt(weightInEarthtx);
        double forceOfGravityEarth = weightInEarth*9.8;
        double forceOfGravityMoon = forceOfGravityEarth*0.16;
        double weightInTheMoon = forceOfGravityMoon/1.6;
        System.out.println ("weight in the Moon");
        System.out.println(weightInTheMoon);


        // Task_2
        /*Напишите метод, который будет увеличивать каждый элемент массива на 10%*/

        System.out.println("Task_2");
        System.out.println("array print");
        double [] array = new double [5];
        array [0] = 1;
        for (int i = 1; i< array.length; i++) {
           array [i] = (array [i-1])*1.1;
        }
        for (int i = 0; i< array.length; i++) {
            System.out.println (array[i]);
        }


        //Task 3

        /*Напишите метод, который будет проверять является ли число палиндромом
        (одинаково читающееся в обоих направлениях).*/

        System.out.println("Task_3");

        System.out.print("Input your Number: ");
        String numberTx = reader.readLine();
        int number = Integer.parseInt(numberTx);

        String reversNumberTx = new StringBuffer(numberTx).reverse().toString();
        int reversNumber = Integer.parseInt(reversNumberTx);
        System.out.println(reversNumber);

        if (number == reversNumber) {
            System.out.print("Your Number " + number + " is palindrome");
        }
        else {
            System.out.println("Your Number " + number + " IS NOT palindrome");
        }


        //Task 4

        //Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)

        System.out.println("Task_4");

        int i;
        for (i = 1; i <= 100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        //Task 5

        //Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)

        System.out.println("Task_5");

        int a;
        for (a = 1; a <= 15; a++) {
            if (a%2 >= 1) {
                System.out.println(a);
            }
        }

        //Task 6
        //Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)

        System.out.println("Task_6");

        int q;
        for (q = 2; q <= 100; q=q+2) {
                System.out.println(q);
            }

        //Task 7
        //Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)

        System.out.println("Task_7");
        System.out.println("print sum");

        int sum = 0;

        for (int t = 20; t <= 200; t++){
            sum += t;
        }
        System.out.println("Сумма всех чисел в диапазоне [20:200]: " + sum);

        //Task 8

        /*Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее
         каждому числу (используя цикл и оператор if else)*/

        System.out.println("Task_8");

        int e;
        for (e = 1; e <= 12; e++) {
            if (e == 1) {
                System.out.println(e + " Январь");
            }else {
                if (e == 2) {
                    System.out.println(e + " Февраль");
                } if (e == 3) {
                       System.out.println(e + " Март");
                } if (e == 4) {
                    System.out.println(e + " Апрель");
                }if (e == 5) {
                    System.out.println(e + " Май");
                }if (e == 6) {
                    System.out.println(e + " Июнь");
                }if (e == 7) {
                    System.out.println(e + " Июль");
                }if (e == 8) {
                    System.out.println(e + " Август");
                }if (e == 9) {
                    System.out.println(e + " Сентябрь");
                }if (e == 10) {
                    System.out.println(e + " Октябрь");
                } if (e == 11) {
                    System.out.println(e + " Ноябрь");
                }if (e == 12) {
                    System.out.println(e + " Декабрь");
                }
            }
        }

        //Task 9

        /*Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
        чтобы значение первой оказалось во второй, а второй - в первой. */

        System.out.println("Task_9");

    int first = 12;
    int second = 25;

    first = first+second;
    second = first-second;
    first = first-second;

    System.out.println(first);
    System.out.println(second);

        //Task  10

        /* Напишите программу с тремя переменными целого типа, первым двум присвойте
        значения, а третьей переменной присвойте их сумму. Выведете значение третей
        переменной на экран. */

        System.out.println("Task_10");

      int a1 = 12;
      int a2 = 15;
      int a3 = a2+a1;

      System.out.println (a3);



        //Task  11

        //Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.

        System.out.println("Task_11");

        int q1 = 12;
        int q3 = 123;
        int q4 = 434;

        System.out.println( "Большее из 3х чисел: " + Math.max ((Math.max (q1, q3)), q4));


        //Task  12

        /*Напишите программу, в которой используются две переменные логического типа (boolean),
        присвойте им значения и выведете для каждой переменной на экран строку "истина",
        если переменная имеет значение true и "ложь", если переменная имеет значение false*/

        System.out.println("Task_12");

        boolean one = true;
        boolean two = false;

        if (one) {
            System.out.println ("Истина one ");
        } else {
            System.out.println ("Ложь one");
        } if (two) {
            System.out.println ("Истина two");
        } else {
            System.out.println("Ложь two");
        }

        //Task  13
        /*Напишите программу, где двум строковым переменным присваиваются значения,
         третей же строковой переменных присвойте объединение (конкатенацию) двух
         предыдущих строк. Затем напечатайте значение третьей строковой переменной.*/

        System.out.println("Task_13");

        String firstString = "Первая строка";
        String secondString = " + вторая строка";

        String thirdString = firstString + secondString;

        System.out.println(thirdString);

        //Task  14

         /*Создайте программу с двумя переменными целого типа, присвойте им
          значения, если первая переменная больше второй, то увеличьте её значение
          на 3, иначе увеличьте значение второй переменной на 8. В конце программы
          выведите значения обоих чисел на экран.*/

        System.out.println("Task_14");

        int r1 = 10;
        int r2 = 8;

        if (r1>r2) {
            r1 = r1 + 3;
        }else {
            r2=r2+8;
        }
        System.out.println(r1);
        System.out.println(r2);


        //Task  15
        /*Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
        for
        while
        do while*/

        System.out.println("Task_15");

        int t13;

        for (t13 = 1; t13 <= 100; t13++)
                System.out.println(t13);

        while (t13 >= 100) {
            System.out.println(t13);
            t13 --;
        }
        t13 = 1; // обнулила переменную, для красивого вывода. (Иначе он выполняет первую функцию как 101).
        do {
            System.out.println(t13);
            t13 ++;
        } while (t13 <= 100);

        //Task  16

        /* Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
         Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть
         таким: 10 15 20 25 30 35. Минимум, максимум и шаг указываются пользователем
         (можно захардкодить).*/

        System.out.println("Task_16");

        System.out.print("Input your min Number: ");
        String minNumberTX = reader.readLine();
        int minNumber = Integer.parseInt(minNumberTX);

        System.out.print("Input your max number: ");
        String maxNumberTX = reader.readLine();
        int maxNumber = Integer.parseInt(maxNumberTX);

        System.out.print("Input your pace: ");
        String pacetTX = reader.readLine();
        int pace = Integer.parseInt(pacetTX);

        int output;
        for (output = minNumber; output<= maxNumber;output=output+pace) {
            System.out.println(output);
        }


        //Task 17

        //Все элементы массива поделить на значение наибольшего элемента этого массива.

        System.out.println("Task_17");


        double[] myArray = {2, 8, 5, 4, 11};
        double max = myArray[0];
        for (int d = 1; d < myArray.length; d++) {
            if (myArray[d] > max) {
                max = myArray[d];
            }
        }
        for (double element: myArray) {
            System.out.println(element=element/max);
        }


       //Task  18

        /* Напишите метод переводящий рубли в доллары
         по заданному курсу. В качестве аргументов укажите кол-во рублей и курс.*/

        System.out.println("Task_18");

        System.out.print("Input your RUB: ");
        String rubTX = reader.readLine();
        double rub = Double.parseDouble(rubTX);

        System.out.print("Input your exchange: ");
        String exchangeTX = reader.readLine();
        double exchange = Double.parseDouble(exchangeTX);

        double usd = rub/exchange;
        System.out.println(usd);


        //Task 19
        //Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.

        System.out.println("Task_19");

        System.out.print("Input number of days: ");

        String daysTX = reader.readLine();
        int days = Integer.parseInt(daysTX);

        if(days<=0) throw new IllegalArgumentException();
        System.out.println("In "+ days+" days: "+ days*24 + " hours, "+ days*1440 +
                " minutes, "+ days*86400+" seconds.");
    }
}

