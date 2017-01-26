package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43289 {
    private final Productionnull_43289 production = new Productionnull_43289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}