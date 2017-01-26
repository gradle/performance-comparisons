package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_178 {
    private final Production28_178 production = new Production28_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}