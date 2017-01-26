package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_162 {
    private final Production28_162 production = new Production28_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}