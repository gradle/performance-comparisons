package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33841 {
    private final Productionnull_33841 production = new Productionnull_33841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}