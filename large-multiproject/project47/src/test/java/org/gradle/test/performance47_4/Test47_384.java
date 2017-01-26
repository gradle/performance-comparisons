package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_384 {
    private final Production47_384 production = new Production47_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}