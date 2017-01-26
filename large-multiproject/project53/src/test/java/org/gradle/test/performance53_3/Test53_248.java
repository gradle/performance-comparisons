package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_248 {
    private final Production53_248 production = new Production53_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}