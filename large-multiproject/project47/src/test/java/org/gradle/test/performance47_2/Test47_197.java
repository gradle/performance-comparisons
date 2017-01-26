package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_197 {
    private final Production47_197 production = new Production47_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}