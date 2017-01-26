package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_376 {
    private final Production75_376 production = new Production75_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}