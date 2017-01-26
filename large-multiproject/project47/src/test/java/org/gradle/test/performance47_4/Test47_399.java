package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_399 {
    private final Production47_399 production = new Production47_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}