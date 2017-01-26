package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_375 {
    private final Production75_375 production = new Production75_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}