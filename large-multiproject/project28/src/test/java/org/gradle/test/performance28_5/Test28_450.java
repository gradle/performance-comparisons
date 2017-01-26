package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_450 {
    private final Production28_450 production = new Production28_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}