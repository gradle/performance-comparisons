package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_439 {
    private final Production17_439 production = new Production17_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}