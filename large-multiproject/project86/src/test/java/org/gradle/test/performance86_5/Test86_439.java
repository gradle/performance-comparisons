package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_439 {
    private final Production86_439 production = new Production86_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}