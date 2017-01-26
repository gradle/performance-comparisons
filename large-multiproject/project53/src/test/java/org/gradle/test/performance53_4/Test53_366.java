package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_366 {
    private final Production53_366 production = new Production53_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}