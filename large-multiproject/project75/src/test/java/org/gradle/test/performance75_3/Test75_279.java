package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_279 {
    private final Production75_279 production = new Production75_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}