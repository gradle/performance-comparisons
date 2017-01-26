package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42954 {
    private final Productionnull_42954 production = new Productionnull_42954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}