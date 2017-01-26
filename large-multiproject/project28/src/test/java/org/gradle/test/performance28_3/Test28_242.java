package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_242 {
    private final Production28_242 production = new Production28_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}