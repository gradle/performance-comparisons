package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_385 {
    private final Production53_385 production = new Production53_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}