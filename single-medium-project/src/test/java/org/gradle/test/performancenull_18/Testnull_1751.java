package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1751 {
    private final Productionnull_1751 production = new Productionnull_1751("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}