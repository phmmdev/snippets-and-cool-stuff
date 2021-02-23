package br.samples.validation.examples;

import java.util.List;

public class PayLoad {

    private List<Person> data;

    public PayLoad(List<Person> data) {
        this.data = data;
    }

    public List<Person> getData() {
        return data;
    }
}
