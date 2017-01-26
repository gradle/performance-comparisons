package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_110 {
    private final Production47_110 production = new Production47_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}