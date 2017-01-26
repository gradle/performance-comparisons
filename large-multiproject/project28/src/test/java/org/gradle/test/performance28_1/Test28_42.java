package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_42 {
    private final Production28_42 production = new Production28_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}