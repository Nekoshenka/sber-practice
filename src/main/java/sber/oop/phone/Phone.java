package sber.oop.phone;

public class Phone {

    private String number;
    private String model;
    private float weight;

    public Phone() {
        System.out.println("Created Phone.");
    }

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("Created Phone with number, model and weight.");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        System.out.println("Created Phone with number, model.");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + "!");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " ("+ number + ")!");
    }

    public String getNumber() {
        return number != null ? number : "not set";
    }

    public void sendMessage() {
        System.out.println("89517395153\n89415436732\n89258546237");
    }

    public String toString() {
        return "Number: " + getNumber()
                + "\nModel: " + (model!= null ? model : "not set")
                + "\nWeight: " + (weight != 0 ? weight + "g" : "not set")
                + "\n";
    }

}