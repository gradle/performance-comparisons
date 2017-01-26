package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4105 {
    private final Productionnull_4105 production = new Productionnull_4105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}