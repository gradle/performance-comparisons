package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_319 {
    private final Production47_319 production = new Production47_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}