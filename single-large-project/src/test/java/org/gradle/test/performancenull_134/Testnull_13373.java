package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13373 {
    private final Productionnull_13373 production = new Productionnull_13373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}