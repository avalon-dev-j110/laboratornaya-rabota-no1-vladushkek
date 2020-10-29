package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    private String country;

    private String city;
    private String street;
    private int buildNumber;
    private int flatNumber;

    public Address (String country, String city, String street, int  buildNumber, int flatNumber){
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildNumber = buildNumber;
        this.flatNumber = flatNumber;
    }

    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}

    public int getBuildNumber() {return buildNumber;}
    public void setBuildNumber(int buildNumber) {this.buildNumber = buildNumber;}

    public int getFlatNumber() {return flatNumber;}
    public void setFlatNumber(int flatNumber) {this.flatNumber = flatNumber;}



}









/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */