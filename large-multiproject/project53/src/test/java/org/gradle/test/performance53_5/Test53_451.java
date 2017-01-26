package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_451 {
    private final Production53_451 production = new Production53_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}