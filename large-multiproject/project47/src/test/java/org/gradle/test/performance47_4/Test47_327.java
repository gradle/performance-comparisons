package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_327 {
    private final Production47_327 production = new Production47_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}