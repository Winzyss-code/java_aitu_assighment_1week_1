package patterns.task8.factories;

import patterns.task8.juniors.PythonJunior;
import patterns.task8.middles.MiddleDeveloper;
import patterns.task8.middles.PythonMiddle;
import patterns.task8.seniors.PythonSenior;
import patterns.task8.seniors.SeniorDeveloper;

public class PythonCourse implements DeveloperCourse {
    @Override
    public patterns.task8.juniors.JuniorDeveloper createJunior() {
        return new PythonJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}
