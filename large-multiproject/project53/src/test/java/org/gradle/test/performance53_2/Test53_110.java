package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_110 {
    private final Production53_110 production = new Production53_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}