package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30175 {
    private final Productionnull_30175 production = new Productionnull_30175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}