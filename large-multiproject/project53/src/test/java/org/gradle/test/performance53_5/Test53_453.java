package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_453 {
    private final Production53_453 production = new Production53_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}