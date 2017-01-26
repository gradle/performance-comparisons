package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2946 {
    private final Productionnull_2946 production = new Productionnull_2946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}