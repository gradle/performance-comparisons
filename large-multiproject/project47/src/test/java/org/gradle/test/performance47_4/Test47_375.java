package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_375 {
    private final Production47_375 production = new Production47_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}