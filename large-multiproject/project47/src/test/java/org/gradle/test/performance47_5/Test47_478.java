package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_478 {
    private final Production47_478 production = new Production47_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}