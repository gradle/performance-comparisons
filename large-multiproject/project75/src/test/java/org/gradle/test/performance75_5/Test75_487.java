package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_487 {
    private final Production75_487 production = new Production75_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}