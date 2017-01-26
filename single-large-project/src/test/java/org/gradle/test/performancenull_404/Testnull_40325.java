package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40325 {
    private final Productionnull_40325 production = new Productionnull_40325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}