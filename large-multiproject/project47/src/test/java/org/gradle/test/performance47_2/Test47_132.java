package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_132 {
    private final Production47_132 production = new Production47_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}