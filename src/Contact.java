import java.io.Serializable;
import java.time.LocalDate;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private LocalDate dateMet;
    private LocalDate birthday;

    public Contact(String name, LocalDate dateMet, LocalDate birthday) {
        this.name = name;
        this.dateMet = dateMet;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateMet() {
        return dateMet;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateMet(LocalDate dateMet) {
        this.dateMet = dateMet;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public long daysUntilBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = birthday.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        return today.until(nextBirthday).getDays();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Met on: " + dateMet + ", Birthday: " + birthday + ", Days until birthday: " + daysUntilBirthday();
    }
}
