package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33781 {
    private final Productionnull_33781 production = new Productionnull_33781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}