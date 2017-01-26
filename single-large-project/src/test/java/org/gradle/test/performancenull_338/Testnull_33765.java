package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33765 {
    private final Productionnull_33765 production = new Productionnull_33765("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}