package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34668 {
    private final Productionnull_34668 production = new Productionnull_34668("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}