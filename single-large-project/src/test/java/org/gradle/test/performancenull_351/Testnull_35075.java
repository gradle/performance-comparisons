package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35075 {
    private final Productionnull_35075 production = new Productionnull_35075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}