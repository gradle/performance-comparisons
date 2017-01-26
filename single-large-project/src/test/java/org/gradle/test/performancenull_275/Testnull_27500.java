package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27500 {
    private final Productionnull_27500 production = new Productionnull_27500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}