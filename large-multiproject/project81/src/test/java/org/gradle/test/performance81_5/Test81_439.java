package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_439 {
    private final Production81_439 production = new Production81_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}