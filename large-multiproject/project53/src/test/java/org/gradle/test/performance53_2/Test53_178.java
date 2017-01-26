package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_178 {
    private final Production53_178 production = new Production53_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}