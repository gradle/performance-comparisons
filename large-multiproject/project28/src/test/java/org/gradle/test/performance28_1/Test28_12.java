package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_12 {
    private final Production28_12 production = new Production28_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}