package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27443 {
    private final Productionnull_27443 production = new Productionnull_27443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}