package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_380 {
    private final Production28_380 production = new Production28_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}