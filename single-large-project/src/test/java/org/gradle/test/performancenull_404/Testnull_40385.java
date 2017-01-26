package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40385 {
    private final Productionnull_40385 production = new Productionnull_40385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}