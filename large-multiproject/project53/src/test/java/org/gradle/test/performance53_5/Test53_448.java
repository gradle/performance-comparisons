package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_448 {
    private final Production53_448 production = new Production53_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}