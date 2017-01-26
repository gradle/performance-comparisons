package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33779 {
    private final Productionnull_33779 production = new Productionnull_33779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}