package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_50 {
    private final Production47_50 production = new Production47_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}