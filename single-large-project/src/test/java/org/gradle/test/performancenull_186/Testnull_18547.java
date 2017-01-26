package org.gradle.test.performancenull_186;

import static org.junit.Assert.*;

public class Testnull_18547 {
    private final Productionnull_18547 production = new Productionnull_18547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}