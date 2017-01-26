package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33709 {
    private final Productionnull_33709 production = new Productionnull_33709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}