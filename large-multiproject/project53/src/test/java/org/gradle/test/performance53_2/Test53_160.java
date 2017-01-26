package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_160 {
    private final Production53_160 production = new Production53_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}