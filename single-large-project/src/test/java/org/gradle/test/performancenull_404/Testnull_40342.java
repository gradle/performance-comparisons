package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40342 {
    private final Productionnull_40342 production = new Productionnull_40342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}