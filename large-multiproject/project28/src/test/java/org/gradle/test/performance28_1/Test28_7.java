package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_7 {
    private final Production28_7 production = new Production28_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}