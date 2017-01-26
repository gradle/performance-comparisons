package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40337 {
    private final Productionnull_40337 production = new Productionnull_40337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}