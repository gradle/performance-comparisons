package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_248 {
    private final Production47_248 production = new Production47_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}