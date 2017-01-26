package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_284 {
    private final Production47_284 production = new Production47_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}