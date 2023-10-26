package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int DEFAULT_COUNT_ENGINE = 2;
    private static final String AIRBUS_MODEL_A380 = "A380";

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        int countEngine = name.equals(AIRBUS_MODEL_A380) ? 4 : DEFAULT_COUNT_ENGINE;
        System.out.println("Количество двигателей равно: " + countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
