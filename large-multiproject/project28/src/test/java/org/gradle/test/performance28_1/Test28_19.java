package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_19 {
    private final Production28_19 production = new Production28_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}