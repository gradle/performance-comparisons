package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33766 {
    private final Productionnull_33766 production = new Productionnull_33766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}