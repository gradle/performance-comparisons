package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_389 {
    private final Production53_389 production = new Production53_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}