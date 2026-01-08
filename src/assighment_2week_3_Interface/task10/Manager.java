package assighment_2week_3_Interface.task10;

class Manager implements Boss {
    public void use(Person person) {
        person.startToWork();
    }

    public void startToWork() {
    }

    public boolean inspiresOthersToWork() {
        return true;
    }
}
