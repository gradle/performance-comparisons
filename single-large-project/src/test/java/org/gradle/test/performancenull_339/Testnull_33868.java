package org.gradle.test.performancenull_339;

import static org.junit.Assert.*;

public class Testnull_33868 {
    private final Productionnull_33868 production = new Productionnull_33868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}