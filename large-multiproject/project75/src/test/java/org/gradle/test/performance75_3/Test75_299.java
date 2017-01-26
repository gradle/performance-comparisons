package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_299 {
    private final Production75_299 production = new Production75_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}