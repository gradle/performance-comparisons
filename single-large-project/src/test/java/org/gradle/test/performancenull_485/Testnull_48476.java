package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48476 {
    private final Productionnull_48476 production = new Productionnull_48476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}