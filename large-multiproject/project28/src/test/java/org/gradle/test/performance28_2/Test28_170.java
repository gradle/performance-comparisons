package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_170 {
    private final Production28_170 production = new Production28_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}