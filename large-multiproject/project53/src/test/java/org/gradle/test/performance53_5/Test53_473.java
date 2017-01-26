package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_473 {
    private final Production53_473 production = new Production53_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}