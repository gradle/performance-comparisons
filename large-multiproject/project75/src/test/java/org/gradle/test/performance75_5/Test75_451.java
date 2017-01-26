package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_451 {
    private final Production75_451 production = new Production75_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}