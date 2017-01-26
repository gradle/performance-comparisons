package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_299 {
    private final Production47_299 production = new Production47_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}