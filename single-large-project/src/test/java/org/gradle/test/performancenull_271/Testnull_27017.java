package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27017 {
    private final Productionnull_27017 production = new Productionnull_27017("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}