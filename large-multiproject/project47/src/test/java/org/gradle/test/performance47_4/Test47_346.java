package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_346 {
    private final Production47_346 production = new Production47_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}