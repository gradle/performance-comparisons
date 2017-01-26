package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_191 {
    private final Production28_191 production = new Production28_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}