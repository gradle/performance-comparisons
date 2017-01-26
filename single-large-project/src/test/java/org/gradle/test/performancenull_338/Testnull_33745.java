package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33745 {
    private final Productionnull_33745 production = new Productionnull_33745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}