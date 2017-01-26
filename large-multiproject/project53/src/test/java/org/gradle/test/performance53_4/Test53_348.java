package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_348 {
    private final Production53_348 production = new Production53_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}