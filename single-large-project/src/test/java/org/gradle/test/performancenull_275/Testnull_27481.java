package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27481 {
    private final Productionnull_27481 production = new Productionnull_27481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}