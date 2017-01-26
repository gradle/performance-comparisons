package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12449 {
    private final Productionnull_12449 production = new Productionnull_12449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}