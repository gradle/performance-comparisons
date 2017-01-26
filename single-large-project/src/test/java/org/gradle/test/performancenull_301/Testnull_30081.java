package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30081 {
    private final Productionnull_30081 production = new Productionnull_30081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}