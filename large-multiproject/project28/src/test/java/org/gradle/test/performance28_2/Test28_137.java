package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_137 {
    private final Production28_137 production = new Production28_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}