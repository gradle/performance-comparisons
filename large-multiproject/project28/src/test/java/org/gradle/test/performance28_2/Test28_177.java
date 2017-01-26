package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_177 {
    private final Production28_177 production = new Production28_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}