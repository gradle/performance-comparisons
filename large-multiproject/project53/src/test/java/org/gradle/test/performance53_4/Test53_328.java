package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_328 {
    private final Production53_328 production = new Production53_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}