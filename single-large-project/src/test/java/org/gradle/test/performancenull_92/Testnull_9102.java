package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9102 {
    private final Productionnull_9102 production = new Productionnull_9102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}