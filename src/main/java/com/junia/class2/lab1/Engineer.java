package com.junia.class2.lab1;

public class Engineer extends Employee {

    private String programmingLanguage;

    public Engineer(
            String name,
            double salary,
            String programmingLanguage
    ) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println(
                "Engineer is writing " + programmingLanguage + " code."
        );
    }

    public void work() {
        System.out.println(
                "Engineer is developing software."
        );
    }
}
