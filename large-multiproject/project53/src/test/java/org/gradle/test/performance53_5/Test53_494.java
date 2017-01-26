package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_494 {
    private final Production53_494 production = new Production53_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}