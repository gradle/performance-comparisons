package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_368 {
    private final Production75_368 production = new Production75_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}