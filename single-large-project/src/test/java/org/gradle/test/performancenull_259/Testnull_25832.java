package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25832 {
    private final Productionnull_25832 production = new Productionnull_25832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}