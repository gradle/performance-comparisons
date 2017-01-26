package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_198 {
    private final Production75_198 production = new Production75_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}