package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_490 {
    private final Production53_490 production = new Production53_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}