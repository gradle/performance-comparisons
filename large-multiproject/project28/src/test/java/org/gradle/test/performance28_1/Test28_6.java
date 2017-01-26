package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_6 {
    private final Production28_6 production = new Production28_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}