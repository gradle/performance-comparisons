package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_292 {
    private final Production75_292 production = new Production75_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}