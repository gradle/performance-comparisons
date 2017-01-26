package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_335 {
    private final Production75_335 production = new Production75_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}