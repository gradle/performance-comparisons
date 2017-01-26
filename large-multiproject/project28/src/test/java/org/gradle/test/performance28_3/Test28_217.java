package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_217 {
    private final Production28_217 production = new Production28_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}