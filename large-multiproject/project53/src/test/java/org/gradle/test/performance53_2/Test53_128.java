package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_128 {
    private final Production53_128 production = new Production53_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}