package pl.edu.pwr.musicschool.model;

public enum DayOfWeek {

    MONDAY("Poniedzialek"),
    TUESDAY("Wtorek"),
    WEDNESDAY("Sroda"),
    THURSDAY("Czwartek"),
    FRIDAY("Piatek"),
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
