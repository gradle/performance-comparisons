package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_312 {
    private final Production53_312 production = new Production53_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}