package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_364 {
    private final Production28_364 production = new Production28_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}