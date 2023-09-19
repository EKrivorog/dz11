package org.example;
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    protected Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        if (this instanceof Woman) {
            return age >= 60;
        } else {
            return age >= 65;
        }
    }

    public void registerPartnership(Person partner) {
        if (this.partner == null && partner.getPartner() == null) {
            this.partner = partner;
            if (partner instanceof Woman) {
                this.lastName = partner.getLastName();
            }
            partner.setPartner(this);
        }
    }

    public void deregisterPartnership(boolean revertLastName) {
        if (partner != null) {
            if (revertLastName && partner instanceof Woman) {
                lastName = partner.getLastName();
            }
            partner = null;
        }
    }


    protected String revertLastName() {
        return lastName;
    }

    public abstract String getFullName();
}
