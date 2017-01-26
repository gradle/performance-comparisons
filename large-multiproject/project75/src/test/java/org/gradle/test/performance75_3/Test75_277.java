package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_277 {
    private final Production75_277 production = new Production75_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}