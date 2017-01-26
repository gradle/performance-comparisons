package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21703 {
    private final Productionnull_21703 production = new Productionnull_21703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}