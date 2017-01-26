package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_459 {
    private final Production47_459 production = new Production47_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}