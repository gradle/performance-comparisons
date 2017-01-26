package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_376 {
    private final Production47_376 production = new Production47_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}