package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_223 {
    private final Production75_223 production = new Production75_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}