package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_439 {
    private final Production95_439 production = new Production95_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}