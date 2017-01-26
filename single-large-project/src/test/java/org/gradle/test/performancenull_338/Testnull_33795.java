package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33795 {
    private final Productionnull_33795 production = new Productionnull_33795("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}