package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_355 {
    private final Production75_355 production = new Production75_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}