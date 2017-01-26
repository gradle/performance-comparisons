package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_48 {
    private final Production28_48 production = new Production28_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}