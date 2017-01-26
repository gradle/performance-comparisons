package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_439 {
    private final Production77_439 production = new Production77_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}