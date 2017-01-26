package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_402 {
    private final Production75_402 production = new Production75_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}