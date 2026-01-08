package assighment_2week_3_Interface.task14;

class Hobby implements Desire, Dream {
    static int INDEX = 1;

    @Override
    public String toString() {
        INDEX++;
        return "" + INDEX;
    }
}
