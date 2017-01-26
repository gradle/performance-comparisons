package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_439 {
    private final Production43_439 production = new Production43_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}