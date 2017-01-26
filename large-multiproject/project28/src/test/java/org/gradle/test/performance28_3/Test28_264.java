package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_264 {
    private final Production28_264 production = new Production28_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}