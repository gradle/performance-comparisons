package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_410 {
    private final Production53_410 production = new Production53_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}