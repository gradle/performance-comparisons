package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_117 {
    private final Production75_117 production = new Production75_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}