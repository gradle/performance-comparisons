package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33763 {
    private final Productionnull_33763 production = new Productionnull_33763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}