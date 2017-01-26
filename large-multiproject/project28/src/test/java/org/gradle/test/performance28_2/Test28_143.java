package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_143 {
    private final Production28_143 production = new Production28_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}