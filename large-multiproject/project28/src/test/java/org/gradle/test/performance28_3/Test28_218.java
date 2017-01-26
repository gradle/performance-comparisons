package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_218 {
    private final Production28_218 production = new Production28_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}