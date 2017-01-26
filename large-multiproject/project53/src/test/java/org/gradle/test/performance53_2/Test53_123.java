package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_123 {
    private final Production53_123 production = new Production53_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}