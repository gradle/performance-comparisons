package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_491 {
    private final Production53_491 production = new Production53_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}