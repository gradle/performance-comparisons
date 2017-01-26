package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27470 {
    private final Productionnull_27470 production = new Productionnull_27470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}