package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_69 {
    private final Production28_69 production = new Production28_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}