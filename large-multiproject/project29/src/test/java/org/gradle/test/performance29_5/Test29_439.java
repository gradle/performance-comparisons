package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_439 {
    private final Production29_439 production = new Production29_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}