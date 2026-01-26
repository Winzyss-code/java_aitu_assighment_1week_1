package patterns.task7.factory;

import patterns.task7.developers.Developer;
import patterns.task7.developers.JavaDeveloper;

public class JavaRush extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}