package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_314 {
    private final Production28_314 production = new Production28_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}