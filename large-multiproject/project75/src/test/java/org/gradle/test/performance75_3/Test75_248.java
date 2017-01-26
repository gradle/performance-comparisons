package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_248 {
    private final Production75_248 production = new Production75_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}