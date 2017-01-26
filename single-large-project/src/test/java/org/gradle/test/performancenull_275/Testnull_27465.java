package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27465 {
    private final Productionnull_27465 production = new Productionnull_27465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}