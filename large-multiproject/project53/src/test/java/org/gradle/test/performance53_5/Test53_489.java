package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_489 {
    private final Production53_489 production = new Production53_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}