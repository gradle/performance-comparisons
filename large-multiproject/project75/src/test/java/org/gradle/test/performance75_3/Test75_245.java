package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_245 {
    private final Production75_245 production = new Production75_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}