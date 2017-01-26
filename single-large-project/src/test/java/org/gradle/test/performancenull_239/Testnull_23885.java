package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23885 {
    private final Productionnull_23885 production = new Productionnull_23885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}