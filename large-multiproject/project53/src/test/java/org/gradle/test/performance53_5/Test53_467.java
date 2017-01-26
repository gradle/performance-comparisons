package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_467 {
    private final Production53_467 production = new Production53_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}