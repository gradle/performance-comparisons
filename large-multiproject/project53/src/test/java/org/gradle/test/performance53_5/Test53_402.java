package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_402 {
    private final Production53_402 production = new Production53_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}