package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_240 {
    private final Production47_240 production = new Production47_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}