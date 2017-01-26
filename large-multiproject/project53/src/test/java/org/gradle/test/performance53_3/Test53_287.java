package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_287 {
    private final Production53_287 production = new Production53_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}