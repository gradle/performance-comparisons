package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_363 {
    private final Production53_363 production = new Production53_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}