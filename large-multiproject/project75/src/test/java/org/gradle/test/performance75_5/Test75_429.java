package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_429 {
    private final Production75_429 production = new Production75_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}