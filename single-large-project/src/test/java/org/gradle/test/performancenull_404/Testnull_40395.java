package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40395 {
    private final Productionnull_40395 production = new Productionnull_40395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}