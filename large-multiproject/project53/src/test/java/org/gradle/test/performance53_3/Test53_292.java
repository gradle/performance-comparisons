package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_292 {
    private final Production53_292 production = new Production53_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}