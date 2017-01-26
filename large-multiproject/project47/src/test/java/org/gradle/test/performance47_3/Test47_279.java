package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_279 {
    private final Production47_279 production = new Production47_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}