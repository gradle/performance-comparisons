package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_233 {
    private final Production75_233 production = new Production75_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}