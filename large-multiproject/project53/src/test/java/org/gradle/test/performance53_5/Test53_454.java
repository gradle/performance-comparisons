package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_454 {
    private final Production53_454 production = new Production53_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}