package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_327 {
    private final Production84_327 production = new Production84_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}