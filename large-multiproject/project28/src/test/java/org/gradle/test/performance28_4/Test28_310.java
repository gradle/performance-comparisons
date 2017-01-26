package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_310 {
    private final Production28_310 production = new Production28_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}