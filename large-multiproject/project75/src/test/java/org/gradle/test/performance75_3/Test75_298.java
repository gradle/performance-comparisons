package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_298 {
    private final Production75_298 production = new Production75_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}