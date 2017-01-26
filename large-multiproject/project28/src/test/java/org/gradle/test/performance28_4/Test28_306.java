package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_306 {
    private final Production28_306 production = new Production28_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}