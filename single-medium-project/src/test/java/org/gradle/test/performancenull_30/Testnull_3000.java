package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_3000 {
    private final Productionnull_3000 production = new Productionnull_3000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}