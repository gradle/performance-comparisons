package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30956 {
    private final Productionnull_30956 production = new Productionnull_30956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}