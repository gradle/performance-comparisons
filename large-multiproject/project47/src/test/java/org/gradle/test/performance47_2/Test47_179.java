package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_179 {
    private final Production47_179 production = new Production47_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}