package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31526 {
    private final Productionnull_31526 production = new Productionnull_31526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}