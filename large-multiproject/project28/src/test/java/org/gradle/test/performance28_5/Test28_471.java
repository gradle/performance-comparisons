package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_471 {
    private final Production28_471 production = new Production28_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}