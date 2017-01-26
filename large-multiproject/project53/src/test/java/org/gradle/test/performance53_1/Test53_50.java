package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_50 {
    private final Production53_50 production = new Production53_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}