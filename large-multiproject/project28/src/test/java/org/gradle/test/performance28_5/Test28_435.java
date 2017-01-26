package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_435 {
    private final Production28_435 production = new Production28_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}