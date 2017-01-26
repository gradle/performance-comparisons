package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_322 {
    private final Production28_322 production = new Production28_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}