package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_279 {
    private final Production84_279 production = new Production84_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}