package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35219 {
    private final Productionnull_35219 production = new Productionnull_35219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}