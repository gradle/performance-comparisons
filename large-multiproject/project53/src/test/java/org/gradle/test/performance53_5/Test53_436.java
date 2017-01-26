package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_436 {
    private final Production53_436 production = new Production53_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}