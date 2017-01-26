package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3225 {
    private final Productionnull_3225 production = new Productionnull_3225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}