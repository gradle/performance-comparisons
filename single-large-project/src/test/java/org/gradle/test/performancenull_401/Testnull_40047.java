package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40047 {
    private final Productionnull_40047 production = new Productionnull_40047("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}