package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_261 {
    private final Production53_261 production = new Production53_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}