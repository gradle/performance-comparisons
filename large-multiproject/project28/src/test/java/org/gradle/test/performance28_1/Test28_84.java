package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_84 {
    private final Production28_84 production = new Production28_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}