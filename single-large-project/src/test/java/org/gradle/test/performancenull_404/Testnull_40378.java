package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40378 {
    private final Productionnull_40378 production = new Productionnull_40378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}