package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_363 {
    private final Production28_363 production = new Production28_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}