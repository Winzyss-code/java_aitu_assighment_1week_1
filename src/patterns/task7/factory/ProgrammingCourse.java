package patterns.task7.factory;

import patterns.task7.developers.Developer;

public abstract class ProgrammingCourse {
    public abstract Developer createDeveloper();

    public void educateStudent() {
        Developer developer = createDeveloper();
        developer.study();
    }
}