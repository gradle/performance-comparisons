package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_63 {
    private final Production28_63 production = new Production28_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}