package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_300 {
    private final Production28_300 production = new Production28_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}