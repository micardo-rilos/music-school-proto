package pl.edu.pwr.musicschool.model;

public enum DayOfWeek {

    MONDAY("Poniedziałek"),
    TUESDAY("Wtorek"),
    WEDNESDAY("Środa"),
    THURSDAY("Czwartek"),
    FRIDAY("Piątek"),
    SATURDAY("Sobota"),
    SUNDAY("Niedziela");

    String toStringName;

    DayOfWeek(String toStringName) {
        this.toStringName = toStringName;
    }

    @Override
    public String toString() {
        return toStringName;
    }
}
