package patterns.task7.factory;

import patterns.task7.developers.Developer;
import patterns.task7.developers.DotNetDeveloper;

public class DotNetCourse extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new DotNetDeveloper();
    }
}

