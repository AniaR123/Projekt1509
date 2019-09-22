package adnotacje;

public @interface WlasnaAdnotacja {
    public enum Priority {
        LOW, MEDIUM, HIGH
    }
    Priority priority () default Priority.MEDIUM;   //funkcja piority() zwraca Priority
    String[] tags() default "";
    String createdBy() default "ADAM";
}
