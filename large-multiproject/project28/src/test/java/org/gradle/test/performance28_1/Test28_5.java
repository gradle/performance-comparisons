package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_5 {
    private final Production28_5 production = new Production28_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}