package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33225 {
    private final Productionnull_33225 production = new Productionnull_33225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}