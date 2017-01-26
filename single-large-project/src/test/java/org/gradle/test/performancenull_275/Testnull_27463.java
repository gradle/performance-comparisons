package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27463 {
    private final Productionnull_27463 production = new Productionnull_27463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}