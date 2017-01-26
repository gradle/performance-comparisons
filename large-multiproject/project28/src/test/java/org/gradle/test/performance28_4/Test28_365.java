package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_365 {
    private final Production28_365 production = new Production28_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}