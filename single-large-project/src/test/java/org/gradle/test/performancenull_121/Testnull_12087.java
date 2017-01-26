package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12087 {
    private final Productionnull_12087 production = new Productionnull_12087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}