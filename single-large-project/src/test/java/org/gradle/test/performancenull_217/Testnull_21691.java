package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21691 {
    private final Productionnull_21691 production = new Productionnull_21691("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}