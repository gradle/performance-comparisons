package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_402 {
    private final Production47_402 production = new Production47_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}