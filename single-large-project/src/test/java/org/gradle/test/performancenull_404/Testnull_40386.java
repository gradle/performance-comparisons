package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40386 {
    private final Productionnull_40386 production = new Productionnull_40386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}