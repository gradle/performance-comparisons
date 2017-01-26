package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_224 {
    private final Production47_224 production = new Production47_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}