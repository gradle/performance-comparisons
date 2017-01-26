package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_332 {
    private final Production47_332 production = new Production47_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}