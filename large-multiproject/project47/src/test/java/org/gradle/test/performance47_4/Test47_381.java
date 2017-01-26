package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_381 {
    private final Production47_381 production = new Production47_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}