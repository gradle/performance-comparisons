package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_211 {
    private final Production53_211 production = new Production53_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}