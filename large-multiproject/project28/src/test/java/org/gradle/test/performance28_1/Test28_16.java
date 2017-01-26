package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_16 {
    private final Production28_16 production = new Production28_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}