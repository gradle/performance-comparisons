package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12492 {
    private final Productionnull_12492 production = new Productionnull_12492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}