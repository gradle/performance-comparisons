package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1268 {
    private final Productionnull_1268 production = new Productionnull_1268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}