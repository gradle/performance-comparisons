package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_472 {
    private final Production53_472 production = new Production53_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}