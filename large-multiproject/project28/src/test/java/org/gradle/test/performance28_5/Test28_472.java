package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_472 {
    private final Production28_472 production = new Production28_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}