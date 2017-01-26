package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_394 {
    private final Production47_394 production = new Production47_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}