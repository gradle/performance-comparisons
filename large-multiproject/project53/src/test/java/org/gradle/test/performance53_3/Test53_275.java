package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_275 {
    private final Production53_275 production = new Production53_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}