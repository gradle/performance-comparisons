package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_428 {
    private final Production47_428 production = new Production47_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}