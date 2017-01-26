package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33792 {
    private final Productionnull_33792 production = new Productionnull_33792("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}