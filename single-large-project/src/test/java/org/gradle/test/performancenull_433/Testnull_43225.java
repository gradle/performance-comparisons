package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43225 {
    private final Productionnull_43225 production = new Productionnull_43225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}