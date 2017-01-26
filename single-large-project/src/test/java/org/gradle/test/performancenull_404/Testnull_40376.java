package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40376 {
    private final Productionnull_40376 production = new Productionnull_40376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}