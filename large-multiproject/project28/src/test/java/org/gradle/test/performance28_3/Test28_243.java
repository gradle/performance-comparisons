package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_243 {
    private final Production28_243 production = new Production28_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}