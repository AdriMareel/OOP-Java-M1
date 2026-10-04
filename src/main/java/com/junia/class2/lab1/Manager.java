package com.junia.class2.lab1;

public class Manager extends Employee {

    private int teamSize;

    public Manager(
            String name,
            double salary,
            int teamSize
    ) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void organizeMeeting() {
        System.out.println(
                "Manager is organizing a meeting with "
                        + teamSize + " employees."
        );
    }

    public void work() {
        System.out.println(
                "Manager is managing the team."
        );
    }
}
