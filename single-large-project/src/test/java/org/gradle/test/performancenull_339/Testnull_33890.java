package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33890 {
    private final Productionnull_33890 production = new Productionnull_33890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}