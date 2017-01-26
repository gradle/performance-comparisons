package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_159 {
    private final Production55_159 production = new Production55_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}