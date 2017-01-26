package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_192 {
    private final Production28_192 production = new Production28_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}