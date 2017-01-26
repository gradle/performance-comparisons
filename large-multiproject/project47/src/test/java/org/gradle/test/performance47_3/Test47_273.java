package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_273 {
    private final Production47_273 production = new Production47_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}