package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_148 {
    private final Production28_148 production = new Production28_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}