package assighment_2week_3_Interface.task7;

class Hobby implements Dream, Desire {
    static int INDEX = 1;

    @Override
    public String toString() {
        INDEX++;
        return "" + INDEX;
    }
}