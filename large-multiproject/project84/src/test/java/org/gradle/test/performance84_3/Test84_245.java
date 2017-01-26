package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_245 {
    private final Production84_245 production = new Production84_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}