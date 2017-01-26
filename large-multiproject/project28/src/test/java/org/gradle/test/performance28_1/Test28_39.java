package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_39 {
    private final Production28_39 production = new Production28_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}