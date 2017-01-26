package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_81 {
    private final Production28_81 production = new Production28_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}