package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_409 {
    private final Production47_409 production = new Production47_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}