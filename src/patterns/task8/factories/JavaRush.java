package patterns.task8.factories;

import patterns.task8.juniors.JavaJunior;
import patterns.task8.middles.JavaMiddle;
import patterns.task8.middles.MiddleDeveloper;
import patterns.task8.seniors.JavaSenior;
import patterns.task8.seniors.SeniorDeveloper;

public class JavaRush implements DeveloperCourse {
    @Override
    public patterns.task8.juniors.JuniorDeveloper createJunior() {
        return new JavaJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaSenior();
    }
}
