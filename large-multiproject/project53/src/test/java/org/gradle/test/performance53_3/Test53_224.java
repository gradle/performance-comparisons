package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_224 {
    private final Production53_224 production = new Production53_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}