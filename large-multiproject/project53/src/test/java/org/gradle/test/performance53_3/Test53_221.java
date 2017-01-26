package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_221 {
    private final Production53_221 production = new Production53_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}