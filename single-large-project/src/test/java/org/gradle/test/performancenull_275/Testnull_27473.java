package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27473 {
    private final Productionnull_27473 production = new Productionnull_27473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}