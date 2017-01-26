package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_407 {
    private final Production53_407 production = new Production53_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}