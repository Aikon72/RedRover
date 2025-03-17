public class Month {
    String name;
    int days;
    int workingDays;

    // Конструктор
    public Month(Month month) {
        this.name = name;
        this.days = days;
        this.workingDays = workingDays;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        return workingDays;
    }

}
