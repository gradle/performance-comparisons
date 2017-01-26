package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36492 {
    private final Productionnull_36492 production = new Productionnull_36492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}