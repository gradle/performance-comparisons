package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3251 {
    private final Productionnull_3251 production = new Productionnull_3251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}