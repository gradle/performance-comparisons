package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_443 {
    private final Production47_443 production = new Production47_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}