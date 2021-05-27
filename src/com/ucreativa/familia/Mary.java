package com.ucreativa.familia;

public class Mary {

    private int age;
    private String hobby;

    public Mary(String saludo,
                int age,
                String hobby) {
        this.age = age;
        this.hobby = hobby;
        System.out.println(saludo);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = this.age + 1;
    }
}
