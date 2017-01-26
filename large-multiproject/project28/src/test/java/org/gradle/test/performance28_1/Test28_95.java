package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_95 {
    private final Production28_95 production = new Production28_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}