package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21087 {
    private final Productionnull_21087 production = new Productionnull_21087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}