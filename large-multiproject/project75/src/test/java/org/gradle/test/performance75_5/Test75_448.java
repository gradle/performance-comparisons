package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_448 {
    private final Production75_448 production = new Production75_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}