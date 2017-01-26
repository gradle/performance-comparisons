package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_439 {
    private final Production38_439 production = new Production38_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}