package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35081 {
    private final Productionnull_35081 production = new Productionnull_35081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}