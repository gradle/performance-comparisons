package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_226 {
    private final Production53_226 production = new Production53_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}