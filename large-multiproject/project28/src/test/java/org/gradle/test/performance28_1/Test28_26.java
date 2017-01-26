package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_26 {
    private final Production28_26 production = new Production28_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}