package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23087 {
    private final Productionnull_23087 production = new Productionnull_23087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}