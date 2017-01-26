package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27456 {
    private final Productionnull_27456 production = new Productionnull_27456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}