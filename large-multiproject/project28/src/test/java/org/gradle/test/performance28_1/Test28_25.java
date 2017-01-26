package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_25 {
    private final Production28_25 production = new Production28_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}