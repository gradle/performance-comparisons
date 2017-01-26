package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_451 {
    private final Production47_451 production = new Production47_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}