package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40349 {
    private final Productionnull_40349 production = new Productionnull_40349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}