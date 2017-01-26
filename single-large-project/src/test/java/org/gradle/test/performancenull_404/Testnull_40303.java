package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40303 {
    private final Productionnull_40303 production = new Productionnull_40303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}