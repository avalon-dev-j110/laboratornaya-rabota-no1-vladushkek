package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
public class Main {
        public static void main(String[] args) {


            Passport ivanovPassport = new Passport(1020, 185647, "Иван", "Иванов", "Иванович", "01.12.1936", "08.05.1997", "УМВД РОССИИ");
            Address ivanovAddress = new Address("Россия", "Санкт-Петербург", "Обручевых", 1, 6);
            Person ivanov = new Person(ivanovPassport, ivanovAddress);

            Passport smithPassport = new Passport(1036, 789655, "John", "Edvard", "Smith", "02.06.1988", "03.08.2000", "MVD");
            Address smithAddress = new Address("UK", "London", "Abbey Road", 15, 5);
            Person smith = new Person(smithPassport, smithAddress);


            System.out.println(ivanov.getFullName());
            System.out.println(ivanov.getAddress());
            System.out.println(smith.getFullName());
            System.out.println(smith.getAddress());

        }
    }



        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
