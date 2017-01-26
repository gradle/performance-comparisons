package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_419 {
    private final Production28_419 production = new Production28_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}