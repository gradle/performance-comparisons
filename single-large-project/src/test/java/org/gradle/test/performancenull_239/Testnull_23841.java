package org.gradle.test.performancenull_239;

import static org.junit.Assert.*;

public class Testnull_23841 {
    private final Productionnull_23841 production = new Productionnull_23841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}