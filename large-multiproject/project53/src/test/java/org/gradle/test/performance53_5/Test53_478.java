package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_478 {
    private final Production53_478 production = new Production53_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}