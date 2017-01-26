package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27089 {
    private final Productionnull_27089 production = new Productionnull_27089("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}