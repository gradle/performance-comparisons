package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33778 {
    private final Productionnull_33778 production = new Productionnull_33778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}