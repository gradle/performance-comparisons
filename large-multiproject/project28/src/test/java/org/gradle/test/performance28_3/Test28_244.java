package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_244 {
    private final Production28_244 production = new Production28_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}