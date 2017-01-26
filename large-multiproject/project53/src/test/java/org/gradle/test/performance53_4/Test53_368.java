package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_368 {
    private final Production53_368 production = new Production53_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}