package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_420 {
    private final Production47_420 production = new Production47_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}