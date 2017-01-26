package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_459 {
    private final Production53_459 production = new Production53_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}