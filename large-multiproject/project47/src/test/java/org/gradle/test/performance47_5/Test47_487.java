package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_487 {
    private final Production47_487 production = new Production47_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}