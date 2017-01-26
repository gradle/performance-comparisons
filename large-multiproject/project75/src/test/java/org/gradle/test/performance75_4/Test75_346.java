package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_346 {
    private final Production75_346 production = new Production75_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}