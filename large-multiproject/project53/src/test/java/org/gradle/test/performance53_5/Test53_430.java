package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_430 {
    private final Production53_430 production = new Production53_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}