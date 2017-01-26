package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33725 {
    private final Productionnull_33725 production = new Productionnull_33725("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}