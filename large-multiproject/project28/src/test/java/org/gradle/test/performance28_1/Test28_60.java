package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_60 {
    private final Production28_60 production = new Production28_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}