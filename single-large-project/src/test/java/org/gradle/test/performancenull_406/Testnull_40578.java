package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40578 {
    private final Productionnull_40578 production = new Productionnull_40578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}