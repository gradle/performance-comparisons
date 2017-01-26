package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_56 {
    private final Production28_56 production = new Production28_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}