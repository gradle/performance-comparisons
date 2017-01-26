package org.gradle.test.performancenull_14;

import static org.junit.Assert.*;

public class Testnull_1373 {
    private final Productionnull_1373 production = new Productionnull_1373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}