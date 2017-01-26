package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_317 {
    private final Production53_317 production = new Production53_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}