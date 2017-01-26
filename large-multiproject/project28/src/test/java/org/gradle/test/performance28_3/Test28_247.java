package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_247 {
    private final Production28_247 production = new Production28_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}