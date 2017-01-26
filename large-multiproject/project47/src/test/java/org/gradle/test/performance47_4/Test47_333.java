package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_333 {
    private final Production47_333 production = new Production47_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}