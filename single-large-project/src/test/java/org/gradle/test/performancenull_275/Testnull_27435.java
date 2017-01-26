package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27435 {
    private final Productionnull_27435 production = new Productionnull_27435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}