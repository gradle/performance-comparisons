package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_328 {
    private final Production47_328 production = new Production47_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}