package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_477 {
    private final Production28_477 production = new Production28_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}