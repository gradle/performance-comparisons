package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_401 {
    private final Production28_401 production = new Production28_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}