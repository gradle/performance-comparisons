package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_408 {
    private final Production75_408 production = new Production75_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}