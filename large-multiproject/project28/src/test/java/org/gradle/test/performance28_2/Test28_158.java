package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_158 {
    private final Production28_158 production = new Production28_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}