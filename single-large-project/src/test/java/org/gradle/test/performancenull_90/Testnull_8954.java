package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8954 {
    private final Productionnull_8954 production = new Productionnull_8954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}