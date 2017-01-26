package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_327 {
    private final Production53_327 production = new Production53_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}