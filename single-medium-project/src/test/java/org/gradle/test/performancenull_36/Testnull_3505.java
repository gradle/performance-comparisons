package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3505 {
    private final Productionnull_3505 production = new Productionnull_3505("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}