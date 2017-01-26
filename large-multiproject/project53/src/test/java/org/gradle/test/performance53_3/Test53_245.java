package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_245 {
    private final Production53_245 production = new Production53_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}