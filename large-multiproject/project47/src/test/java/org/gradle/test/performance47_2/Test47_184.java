package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_184 {
    private final Production47_184 production = new Production47_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}