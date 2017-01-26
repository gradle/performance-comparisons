package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_373 {
    private final Production28_373 production = new Production28_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}