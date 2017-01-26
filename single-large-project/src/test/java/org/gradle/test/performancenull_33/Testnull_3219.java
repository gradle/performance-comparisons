package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3219 {
    private final Productionnull_3219 production = new Productionnull_3219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}