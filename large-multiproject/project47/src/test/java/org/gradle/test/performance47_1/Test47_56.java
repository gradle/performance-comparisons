package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_56 {
    private final Production47_56 production = new Production47_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}