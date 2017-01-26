package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_319 {
    private final Production75_319 production = new Production75_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}