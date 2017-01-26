package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43435 {
    private final Productionnull_43435 production = new Productionnull_43435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}