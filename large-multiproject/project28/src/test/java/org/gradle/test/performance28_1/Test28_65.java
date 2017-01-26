package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_65 {
    private final Production28_65 production = new Production28_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}