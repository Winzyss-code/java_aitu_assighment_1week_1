package patterns.task7.factory;
import patterns.task7.developers.Developer;
import patterns.task7.developers.KotlinDeveloper;

public class KotlinCourse extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
