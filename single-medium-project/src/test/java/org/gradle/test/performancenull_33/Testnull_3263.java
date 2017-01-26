package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3263 {
    private final Productionnull_3263 production = new Productionnull_3263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}