package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_423 {
    private final Production28_423 production = new Production28_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}