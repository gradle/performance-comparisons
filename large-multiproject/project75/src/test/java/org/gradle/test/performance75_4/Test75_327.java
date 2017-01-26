package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_327 {
    private final Production75_327 production = new Production75_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}