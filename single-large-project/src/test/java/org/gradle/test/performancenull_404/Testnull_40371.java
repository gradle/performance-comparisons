package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40371 {
    private final Productionnull_40371 production = new Productionnull_40371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}