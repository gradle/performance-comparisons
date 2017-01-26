package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33045 {
    private final Productionnull_33045 production = new Productionnull_33045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}