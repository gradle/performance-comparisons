package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20087 {
    private final Productionnull_20087 production = new Productionnull_20087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}