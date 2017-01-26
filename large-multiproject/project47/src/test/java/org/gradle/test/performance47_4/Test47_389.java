package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_389 {
    private final Production47_389 production = new Production47_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}