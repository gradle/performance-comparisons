package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_429 {
    private final Production53_429 production = new Production53_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}