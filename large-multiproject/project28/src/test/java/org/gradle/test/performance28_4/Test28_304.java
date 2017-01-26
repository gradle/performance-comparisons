package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_304 {
    private final Production28_304 production = new Production28_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}