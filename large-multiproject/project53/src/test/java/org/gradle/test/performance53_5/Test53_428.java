package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_428 {
    private final Production53_428 production = new Production53_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}