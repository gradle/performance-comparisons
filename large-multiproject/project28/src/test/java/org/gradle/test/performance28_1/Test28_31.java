package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_31 {
    private final Production28_31 production = new Production28_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}