package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_115 {
    private final Production53_115 production = new Production53_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}