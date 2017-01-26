package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_280 {
    private final Production47_280 production = new Production47_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}