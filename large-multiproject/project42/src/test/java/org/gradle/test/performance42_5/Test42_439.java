package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_439 {
    private final Production42_439 production = new Production42_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}