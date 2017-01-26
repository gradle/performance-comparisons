package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40100 {
    private final Productionnull_40100 production = new Productionnull_40100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}