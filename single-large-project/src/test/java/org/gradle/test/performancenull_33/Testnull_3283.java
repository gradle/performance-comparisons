package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3283 {
    private final Productionnull_3283 production = new Productionnull_3283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}