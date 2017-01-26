package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_376 {
    private final Production53_376 production = new Production53_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}