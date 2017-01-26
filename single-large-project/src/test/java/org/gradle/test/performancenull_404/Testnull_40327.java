package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40327 {
    private final Productionnull_40327 production = new Productionnull_40327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}