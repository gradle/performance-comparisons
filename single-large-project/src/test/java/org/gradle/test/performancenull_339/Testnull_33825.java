package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33825 {
    private final Productionnull_33825 production = new Productionnull_33825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}