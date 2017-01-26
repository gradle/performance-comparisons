package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_59 {
    private final Production28_59 production = new Production28_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}