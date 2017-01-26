package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_232 {
    private final Production47_232 production = new Production47_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}