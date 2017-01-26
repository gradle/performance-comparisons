package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40372 {
    private final Productionnull_40372 production = new Productionnull_40372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}