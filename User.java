import java.time.LocalDate;

class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Date of Birth: " + this.dob);
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }
}