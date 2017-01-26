package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_233 {
    private final Production47_233 production = new Production47_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}