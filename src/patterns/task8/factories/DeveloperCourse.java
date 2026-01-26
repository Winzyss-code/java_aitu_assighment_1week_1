package patterns.task8.factories;

import patterns.task8.middles.MiddleDeveloper;
import patterns.task8.seniors.SeniorDeveloper;

public interface DeveloperCourse {
    patterns.task8.juniors.JuniorDeveloper createJunior();

    MiddleDeveloper createMiddle();

    SeniorDeveloper createSenior();
}
