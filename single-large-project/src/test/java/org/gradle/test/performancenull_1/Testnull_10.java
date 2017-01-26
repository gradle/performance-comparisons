package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_10 {
    private final Productionnull_10 production = new Productionnull_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}