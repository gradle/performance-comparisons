package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_50 {
    private final Production75_50 production = new Production75_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}