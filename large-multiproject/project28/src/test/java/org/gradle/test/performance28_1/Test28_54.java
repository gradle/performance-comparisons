package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_54 {
    private final Production28_54 production = new Production28_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}