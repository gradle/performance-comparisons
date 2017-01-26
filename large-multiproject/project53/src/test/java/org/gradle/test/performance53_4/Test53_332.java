package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_332 {
    private final Production53_332 production = new Production53_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}