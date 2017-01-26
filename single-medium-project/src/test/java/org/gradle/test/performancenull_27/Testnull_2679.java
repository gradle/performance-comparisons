package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2679 {
    private final Productionnull_2679 production = new Productionnull_2679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}