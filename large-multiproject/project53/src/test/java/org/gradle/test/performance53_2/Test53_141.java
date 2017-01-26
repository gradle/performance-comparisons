package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_141 {
    private final Production53_141 production = new Production53_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}