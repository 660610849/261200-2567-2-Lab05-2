public class Main {
    public static void main(String[] args) {
        User john = new User("John", 1990, 12, 24);
        Admin nicolas = new Admin("Nicolas", 1964, 12, 24);

        john.displayInfo();
        john.displayHappyBirthday();

        nicolas.displayInfo(true);
        nicolas.displayHappyBirthday();
    }
}
