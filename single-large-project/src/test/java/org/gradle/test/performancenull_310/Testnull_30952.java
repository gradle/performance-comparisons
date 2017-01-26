package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30952 {
    private final Productionnull_30952 production = new Productionnull_30952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}