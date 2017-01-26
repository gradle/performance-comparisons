package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40055 {
    private final Productionnull_40055 production = new Productionnull_40055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}