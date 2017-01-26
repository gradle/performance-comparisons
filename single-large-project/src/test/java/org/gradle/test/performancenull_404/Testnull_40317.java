package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40317 {
    private final Productionnull_40317 production = new Productionnull_40317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}