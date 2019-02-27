package com.zipcodewilmington.assessment2.part3;

public class Bird implements Animal{
    String migrationMonth;
    public String move() {

        return null;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return null;
    }

    public void setMigrationMonth(String expected) {
        this.migrationMonth=expected;
    }

    public String getMigrationMonth() {
        return migrationMonth;
    }
}
