package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_17 {
    private final Production28_17 production = new Production28_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}