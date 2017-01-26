package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_439 {
    private final Production60_439 production = new Production60_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}