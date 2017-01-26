package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_488 {
    private final Production28_488 production = new Production28_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}