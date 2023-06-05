import java.util.Calendar;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){
        Calendar rok = Calendar.getInstance();
        return rok.get(Calendar.YEAR)-birthdayYear;
    }
}