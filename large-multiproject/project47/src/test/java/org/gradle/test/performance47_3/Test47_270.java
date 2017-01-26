package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_270 {
    private final Production47_270 production = new Production47_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}