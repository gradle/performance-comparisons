package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_399 {
    private final Production53_399 production = new Production53_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}