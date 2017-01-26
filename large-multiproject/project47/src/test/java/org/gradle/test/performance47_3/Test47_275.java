package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_275 {
    private final Production47_275 production = new Production47_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}