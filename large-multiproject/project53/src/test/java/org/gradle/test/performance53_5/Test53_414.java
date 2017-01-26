package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_414 {
    private final Production53_414 production = new Production53_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}