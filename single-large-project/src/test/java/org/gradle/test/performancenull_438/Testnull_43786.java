package org.gradle.test.performancenull_438;

import static org.junit.Assert.*;

public class Testnull_43786 {
    private final Productionnull_43786 production = new Productionnull_43786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}