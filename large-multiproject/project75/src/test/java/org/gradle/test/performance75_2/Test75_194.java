package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_194 {
    private final Production75_194 production = new Production75_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}