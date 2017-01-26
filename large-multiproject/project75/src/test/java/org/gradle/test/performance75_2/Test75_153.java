package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_153 {
    private final Production75_153 production = new Production75_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}