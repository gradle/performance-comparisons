package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_21 {
    private final Production53_21 production = new Production53_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}