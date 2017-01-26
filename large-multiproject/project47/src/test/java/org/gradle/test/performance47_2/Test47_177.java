package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_177 {
    private final Production47_177 production = new Production47_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}