package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_468 {
    private final Production28_468 production = new Production28_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}