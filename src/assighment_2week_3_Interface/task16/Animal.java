package assighment_2week_3_Interface.task16;


enum Color {
    GRAY, WHITE, BLACK, RED
}

public interface Animal {
    default Color getColor() {
        return Color.GRAY;
    }

    default Integer getAge() {
        return 0;
    }
}
