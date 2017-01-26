package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5041 {
    private final Productionnull_5041 production = new Productionnull_5041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}