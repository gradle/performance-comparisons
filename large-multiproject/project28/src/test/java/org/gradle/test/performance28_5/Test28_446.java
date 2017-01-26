package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_446 {
    private final Production28_446 production = new Production28_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}