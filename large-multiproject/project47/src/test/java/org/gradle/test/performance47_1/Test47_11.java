package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_11 {
    private final Production47_11 production = new Production47_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}