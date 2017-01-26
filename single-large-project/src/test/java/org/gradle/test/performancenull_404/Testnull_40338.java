package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40338 {
    private final Productionnull_40338 production = new Productionnull_40338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}