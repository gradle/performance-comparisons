package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_316 {
    private final Production75_316 production = new Production75_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}