package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_192 {
    private final Production53_192 production = new Production53_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}