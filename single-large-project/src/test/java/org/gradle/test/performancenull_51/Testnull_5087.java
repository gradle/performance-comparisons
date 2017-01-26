package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5087 {
    private final Productionnull_5087 production = new Productionnull_5087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}