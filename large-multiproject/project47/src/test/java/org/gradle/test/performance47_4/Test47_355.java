package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_355 {
    private final Production47_355 production = new Production47_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}