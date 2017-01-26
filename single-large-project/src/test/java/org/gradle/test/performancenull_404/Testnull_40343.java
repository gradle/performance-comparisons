package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40343 {
    private final Productionnull_40343 production = new Productionnull_40343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}