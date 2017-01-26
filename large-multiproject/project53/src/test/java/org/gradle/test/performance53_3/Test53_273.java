package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_273 {
    private final Production53_273 production = new Production53_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}