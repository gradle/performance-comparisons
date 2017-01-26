package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_439 {
    private final Production24_439 production = new Production24_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}