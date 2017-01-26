package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_292 {
    private final Production47_292 production = new Production47_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}