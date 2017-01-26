package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40346 {
    private final Productionnull_40346 production = new Productionnull_40346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}