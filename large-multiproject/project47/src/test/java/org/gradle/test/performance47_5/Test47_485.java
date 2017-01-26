package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_485 {
    private final Production47_485 production = new Production47_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}