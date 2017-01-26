package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25449 {
    private final Productionnull_25449 production = new Productionnull_25449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}