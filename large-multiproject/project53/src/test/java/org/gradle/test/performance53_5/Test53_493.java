package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_493 {
    private final Production53_493 production = new Production53_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}