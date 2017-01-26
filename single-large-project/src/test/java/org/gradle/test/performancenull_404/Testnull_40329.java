package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40329 {
    private final Productionnull_40329 production = new Productionnull_40329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}