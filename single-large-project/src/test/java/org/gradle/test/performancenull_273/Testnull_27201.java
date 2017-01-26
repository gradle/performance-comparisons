package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27201 {
    private final Productionnull_27201 production = new Productionnull_27201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}