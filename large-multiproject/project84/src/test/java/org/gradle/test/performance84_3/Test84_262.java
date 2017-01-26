package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_262 {
    private final Production84_262 production = new Production84_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}