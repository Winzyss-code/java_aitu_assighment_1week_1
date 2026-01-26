package patterns.task8.factories;

import patterns.task8.juniors.JavaScriptJunior;
import patterns.task8.middles.JavaScriptMiddle;
import patterns.task8.middles.MiddleDeveloper;
import patterns.task8.seniors.JavaScriptSenior;
import patterns.task8.seniors.SeniorDeveloper;

public class JavaScriptCourse implements DeveloperCourse {
    @Override
    public patterns.task8.juniors.JuniorDeveloper createJunior() {
        return new JavaScriptJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaScriptMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaScriptSenior();
    }
}
