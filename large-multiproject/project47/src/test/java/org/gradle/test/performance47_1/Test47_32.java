package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_32 {
    private final Production47_32 production = new Production47_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}