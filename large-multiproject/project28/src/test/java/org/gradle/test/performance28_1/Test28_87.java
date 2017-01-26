package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_87 {
    private final Production28_87 production = new Production28_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}