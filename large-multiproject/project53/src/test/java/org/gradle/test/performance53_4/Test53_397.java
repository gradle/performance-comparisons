package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_397 {
    private final Production53_397 production = new Production53_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}