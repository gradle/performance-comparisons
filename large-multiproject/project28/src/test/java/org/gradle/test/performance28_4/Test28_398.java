package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_398 {
    private final Production28_398 production = new Production28_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}