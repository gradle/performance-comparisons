package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_344 {
    private final Production53_344 production = new Production53_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}