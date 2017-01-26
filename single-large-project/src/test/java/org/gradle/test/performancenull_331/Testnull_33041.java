package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33041 {
    private final Productionnull_33041 production = new Productionnull_33041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}