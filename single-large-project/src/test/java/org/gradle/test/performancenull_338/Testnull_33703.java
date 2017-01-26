package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33703 {
    private final Productionnull_33703 production = new Productionnull_33703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}