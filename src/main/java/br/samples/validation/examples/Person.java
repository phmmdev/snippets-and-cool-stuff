package br.samples.validation.examples;

public class Person {

    private String name;
    private String document;

    public Person(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

}
