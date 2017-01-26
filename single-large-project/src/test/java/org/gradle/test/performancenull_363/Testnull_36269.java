package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36269 {
    private final Productionnull_36269 production = new Productionnull_36269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}