package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_439 {
    private final Production53_439 production = new Production53_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}