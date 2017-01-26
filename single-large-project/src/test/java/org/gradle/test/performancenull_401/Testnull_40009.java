package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40009 {
    private final Productionnull_40009 production = new Productionnull_40009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}