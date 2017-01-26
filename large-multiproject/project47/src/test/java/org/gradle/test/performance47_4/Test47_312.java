package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_312 {
    private final Production47_312 production = new Production47_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}