package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_277 {
    private final Production84_277 production = new Production84_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}