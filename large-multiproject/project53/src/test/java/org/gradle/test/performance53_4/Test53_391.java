package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_391 {
    private final Production53_391 production = new Production53_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}