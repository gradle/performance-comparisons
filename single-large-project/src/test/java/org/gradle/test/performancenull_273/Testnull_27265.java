package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27265 {
    private final Productionnull_27265 production = new Productionnull_27265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}