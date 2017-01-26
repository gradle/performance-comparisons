package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_295 {
    private final Production53_295 production = new Production53_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}