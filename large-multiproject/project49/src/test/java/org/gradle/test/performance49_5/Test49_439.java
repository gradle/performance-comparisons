package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_439 {
    private final Production49_439 production = new Production49_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}