package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    private int series;
    private int number;
    private String name;
    private String lastname;
    private String patronimic;
    private String middlename;
    private String dateOfBirth;
    private String dateOfIssued;
    private String placeOfIssued;



    public Passport(int series, int number, String name, String middlename, String lastname, String dateOfBirth, String dateOfIssued, String placeOfIssued) {
        this.number = number;
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssued = dateOfIssued;
        this.placeOfIssued = placeOfIssued;

    }

    public Passport(int series, int number, String name, String lastname, String patronimic, String dateOfBirth, String dateOfIssued, String placeOfIssued) {
        this.number = number;
        this.name = name;
        this.patronimic = patronimic;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssued = dateOfIssued;
        this.placeOfIssued = placeOfIssued;

    }

    public int getSeries() {return series;}
    public void setSeries(int series) {this.series = series;}

    public int getNumber() {return number; }
     public void setNumber (int number) {this.number = number;}

    public String getName() {return name;}
    public void  setName (String name) {this.name = name;}

    public String getLastname() {return lastname;}
    public void  setLastname (String lastname) {this.lastname = lastname;}

    public String getMiddlename() {return middlename;}
    public void  setMiddlename (String middlename) {this.middlename = middlename;}

    public String getPatronimic() {return patronimic;}
    public void setPatronimic(String patronimic) {this.patronimic = patronimic;}

    public String getDateOfBirth() {return dateOfBirth;}
    public void  setDateOfBirth (String dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public String getDateOfIssued() {return dateOfIssued;}
    public void setDateOfIssued (String dateOfIssued) {this.dateOfIssued = dateOfIssued;}

    public String getPlaceOfIssued() {return placeOfIssued;}
    public void setPlaceOfIssued (String placeOfIssued) {this.placeOfIssued = placeOfIssued;}


}


/*
 * TODO(Студент): Закончить определение класса.
 *
 * 1. Объявить атрибуты класса.
 *
 * 2. Определить необходимые методы класса. Подумайте о
 *    том, какие методы должны существовать в классе,
 *    чтобы обеспечивать получение всей необходимой
 *    информации о состоянии объектов данного класса.
 *    Все ли поля обязательно будут проинициализированы
 *    при создании экземпляра?
 *
 * 3. Создайте все необходимые конструкторы класса.
 *
 * 4. Помните о возможности существования перегруженных
 *    конструкторов.
 *
 * 5. Обеспечте возможность использования класса за
 *    пределами пакета.
 */
