package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_429 {
    private final Production47_429 production = new Production47_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}