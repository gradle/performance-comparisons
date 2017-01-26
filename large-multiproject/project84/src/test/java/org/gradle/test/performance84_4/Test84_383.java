package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_383 {
    private final Production84_383 production = new Production84_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}