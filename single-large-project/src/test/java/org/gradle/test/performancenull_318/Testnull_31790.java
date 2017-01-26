package org.gradle.test.performancenull_318;

import static org.junit.Assert.*;

public class Testnull_31790 {
    private final Productionnull_31790 production = new Productionnull_31790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}