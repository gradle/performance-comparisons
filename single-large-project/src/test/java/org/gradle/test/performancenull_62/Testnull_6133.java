package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6133 {
    private final Productionnull_6133 production = new Productionnull_6133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}