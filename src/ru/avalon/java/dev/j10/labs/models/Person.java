package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    private Passport passport;
    private Address address;

    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }


    public String getFullName() {
        System.out.println(getFullName());

        if (passport.getPatronimic() == null && passport.getMiddlename() == null) {
            return passport.getName() + " " + passport.getLastname();
        } else if (passport.getPatronimic() == null) {
            return passport.getName() + " " + passport.getMiddlename().substring(0) + ". " + passport.getLastname();
        } else if (passport.getMiddlename() == null) {
            return passport.getName() + " " + passport.getPatronimic() + " " + passport.getLastname();
        }
    }

    public String getAddress() {
        System.out.println(getAddress());
        return address.getCountry() + address.getCity() + address.getStreet() + address.getBuildNumber() + address.getFlatNumber();


    }
}

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */

    /*
     * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
     */


