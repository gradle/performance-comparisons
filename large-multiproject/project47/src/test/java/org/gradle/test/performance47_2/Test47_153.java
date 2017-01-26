package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_153 {
    private final Production47_153 production = new Production47_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}