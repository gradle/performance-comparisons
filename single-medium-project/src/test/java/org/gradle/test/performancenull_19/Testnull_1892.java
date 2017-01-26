package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1892 {
    private final Productionnull_1892 production = new Productionnull_1892("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}