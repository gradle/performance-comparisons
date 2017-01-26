package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30151 {
    private final Productionnull_30151 production = new Productionnull_30151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}