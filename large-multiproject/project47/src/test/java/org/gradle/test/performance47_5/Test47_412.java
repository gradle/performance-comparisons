package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_412 {
    private final Production47_412 production = new Production47_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}