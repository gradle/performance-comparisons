package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_493 {
    private final Production75_493 production = new Production75_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}