package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_283 {
    private final Production53_283 production = new Production53_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}