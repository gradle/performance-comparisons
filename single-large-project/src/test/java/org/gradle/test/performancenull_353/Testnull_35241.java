package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35241 {
    private final Productionnull_35241 production = new Productionnull_35241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}