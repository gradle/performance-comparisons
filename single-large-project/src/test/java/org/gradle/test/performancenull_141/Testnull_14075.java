package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14075 {
    private final Productionnull_14075 production = new Productionnull_14075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}