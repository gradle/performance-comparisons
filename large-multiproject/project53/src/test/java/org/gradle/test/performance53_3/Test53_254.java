package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_254 {
    private final Production53_254 production = new Production53_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}