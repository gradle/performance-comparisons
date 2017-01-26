package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27472 {
    private final Productionnull_27472 production = new Productionnull_27472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}