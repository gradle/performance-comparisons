package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33251 {
    private final Productionnull_33251 production = new Productionnull_33251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}