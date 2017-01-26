package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40345 {
    private final Productionnull_40345 production = new Productionnull_40345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}