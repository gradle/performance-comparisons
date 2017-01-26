package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27469 {
    private final Productionnull_27469 production = new Productionnull_27469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}