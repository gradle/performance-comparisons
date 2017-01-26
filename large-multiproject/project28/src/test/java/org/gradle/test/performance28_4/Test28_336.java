package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_336 {
    private final Production28_336 production = new Production28_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}