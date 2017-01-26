package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_490 {
    private final Production75_490 production = new Production75_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}