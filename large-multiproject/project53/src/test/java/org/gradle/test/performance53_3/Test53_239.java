package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_239 {
    private final Production53_239 production = new Production53_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}