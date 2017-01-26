package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_284 {
    private final Production53_284 production = new Production53_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}