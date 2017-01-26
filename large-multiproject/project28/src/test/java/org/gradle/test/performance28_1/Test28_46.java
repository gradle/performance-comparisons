package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_46 {
    private final Production28_46 production = new Production28_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}