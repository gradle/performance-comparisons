package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7401 {
    private final Productionnull_7401 production = new Productionnull_7401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}