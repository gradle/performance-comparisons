package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_190 {
    private final Production28_190 production = new Production28_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}