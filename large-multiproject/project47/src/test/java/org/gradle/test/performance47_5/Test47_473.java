package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_473 {
    private final Production47_473 production = new Production47_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}